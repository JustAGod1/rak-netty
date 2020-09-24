package ru.justagod.raktest.netty.channel

import io.netty.channel.ChannelOutboundBuffer
import io.netty.channel.ChannelPromise
import io.netty.util.internal.ThrowableUtil
import ru.justagod.raktest.driver.RakOutboundPacket
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.selection.SelectableRakPeer
import ru.justagod.raktest.netty.util.FastSystemAddress
import ru.justagod.slikenet.*
import java.net.InetSocketAddress
import java.net.SocketAddress
import java.nio.channels.ClosedChannelException
import java.nio.channels.ConnectionPendingException

class RakNetClientChannel : RakNetAbstractChannel(null) {
    private val peer = SelectableRakPeer(RakPeerInterface.GetInstance())
    private var connectionPromise: ChannelPromise? = null

    private var requestedRemoteSocketAddress: SocketAddress? = null
    private var remoteSocketAddress: SocketAddress? = null
    private var remoteAddress: FastSystemAddress? = null

    private var open = false


    init {
        startupPeer(peer.peer, null, 1)
        open = true
    }

    override fun peer(): SelectableRakPeer = peer

    override fun processPacket(packet: RakPacket) {
        if (packet.type() == DefaultMessageIDTypes.ID_CONNECTION_REQUEST_ACCEPTED.swigValue()) {
            val connectionPromise = connectionPromise ?: error("Connection wasn't requested but was accepted")

            if (!connectionPromise.trySuccess()) {
                unsafe().close(unsafe().voidPromise())
                return
            }

            remoteAddress = packet.address
            remoteSocketAddress = requestedRemoteSocketAddress
            requestedRemoteSocketAddress = null

        } else {
            pipeline().fireChannelRead(packet)
        }
    }

    override fun doRegister() {
        eventLoop().registerSelector(peer.makeUnownedSelector(this))
    }

    override fun isOpen(): Boolean = open

    override fun isActive(): Boolean = peer.peer.IsActive()

    override fun localAddress0(): SocketAddress {
        throw NotImplementedError()
    }

    override fun remoteAddress0(): SocketAddress? = remoteSocketAddress

    override fun doBind(localAddress: SocketAddress?) {
        throw NotImplementedError()
    }

    override fun doDisconnect() {
        doClose()
    }

    override fun doClose() {
        peer.peer.Shutdown(100)
        open = false
    }

    override fun newUnsafe(): AbstractUnsafe = RakNetClientUnsafe()

    override fun doWrite(input: ChannelOutboundBuffer) {
        if (remoteAddress == null) error("Not connected")

        var msg = input.current() as RakOutboundPacket?

        while (msg != null) {
            // мне не нравится
            val arr = msg.data.array()
            peer.peer.Send(
                String(arr),
                arr.size,
                msg.priority,
                msg.reliability,
                (0).toChar(),
                AddressOrGUID(remoteAddress!!.systemAddress),
                false
            )
            input.remove()
            msg = input.current() as RakOutboundPacket?
        }
    }


    private inner class RakNetClientUnsafe: RakNetAbstractChannel.RakNetUnsafeImpl() {

        override fun connect(remoteAddress: SocketAddress, localAddress: SocketAddress?, promise: ChannelPromise) {
            if (this@RakNetClientChannel.remoteAddress != null) {
                promise.setFailure(RuntimeException("already connected"))
            }
            try {
                if (connectionPromise != null) {
                    throw ConnectionPendingException()
                }
                connectionPromise = promise
                requestedRemoteSocketAddress = remoteSocketAddress

                remoteAddress as InetSocketAddress
                val result = peer.peer.Connect(
                    remoteAddress.address.hostAddress,
                    remoteAddress.port,
                    null,
                    0
                )

                if (result != ConnectionAttemptResult.CONNECTION_ATTEMPT_STARTED) {
                    throw RuntimeException("Exception while starting connection $result")
                }
            } catch (t: Throwable) {
                promise.tryFailure(annotateConnectException(t, remoteAddress))
                closeIfClosed()
            }

        }
    }

}