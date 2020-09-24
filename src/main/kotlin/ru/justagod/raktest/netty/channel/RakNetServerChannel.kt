package ru.justagod.raktest.netty.channel

import io.netty.channel.*
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.selection.SelectableRakPeer
import ru.justagod.slikenet.*
import java.net.InetSocketAddress
import java.net.SocketAddress

class RakNetServerChannel : RakNetAbstractChannel(null), ServerChannel {

    private val peer = SelectableRakPeer(RakPeerInterface.GetInstance())
    private val config = RakNetConfig(this)


    private var localAddress: SocketAddress? = null

    override fun config(): ChannelConfig = config

    override fun peer(): SelectableRakPeer = peer

    override fun isOpen(): Boolean = true

    override fun isActive(): Boolean = peer.peer.IsActive()

    override fun localAddress0(): SocketAddress? = localAddress

    override fun remoteAddress0(): SocketAddress {
        throw NotImplementedError()
    }

    override fun doBind(localAddress: SocketAddress) {
        startupPeer(peer.peer, localAddress, config.maxConnections.toLong())
        peer.peer.SetMaximumIncomingConnections(config.maxConnections)
    }

    override fun doDisconnect() {
        throw NotImplementedError()
    }

    override fun doClose() {
        peer.peer.Shutdown(300)
    }

    override fun doWrite(`in`: ChannelOutboundBuffer?) {
        throw NotImplementedError()
    }


    override fun doRegister() {
        eventLoop().registerSelector(peer.makeUnownedSelector(this))
    }


    override fun processPacket(packet: RakPacket) {
        if (packet.type() != DefaultMessageIDTypes.ID_NEW_INCOMING_CONNECTION.swigValue()) {
            error("Something went wrong. Got packet type ${packet.type()}")
        }

        pipeline().fireChannelRead(RakNetChildChannel(this, packet.address))
    }



}