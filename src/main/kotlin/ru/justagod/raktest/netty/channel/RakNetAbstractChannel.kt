package ru.justagod.raktest.netty.channel

import io.netty.channel.*
import ru.justagod.raktest.netty.loop.RakNetEventLoop
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.selection.SelectableRakPeer
import ru.justagod.slikenet.RakPeerInterface
import ru.justagod.slikenet.SocketDescriptor
import ru.justagod.slikenet.StartupResult
import java.net.InetSocketAddress
import java.net.SocketAddress

abstract class RakNetAbstractChannel(parent: RakNetAbstractChannel?) : AbstractChannel(parent) {

    private val config = DefaultChannelConfig(this)

    // Actually we don't support any configuring on client but let pretend we do
    override fun config(): ChannelConfig = config


    override fun metadata(): ChannelMetadata = metadata

    override fun isCompatible(loop: EventLoop?): Boolean = loop is RakNetEventLoop


    override fun doBeginRead() { }

    override fun eventLoop() = super.eventLoop() as RakNetEventLoop

    override fun unsafe() = super.unsafe() as RakNetUnsafe

    override fun newUnsafe(): AbstractUnsafe = RakNetUnsafeImpl()

    abstract fun peer(): SelectableRakPeer


    protected fun startupPeer(peer: RakPeerInterface, localAddress: SocketAddress?, maxConnections: Long) {
        val sd = if (localAddress != null) {
            localAddress as InetSocketAddress
            SocketDescriptor(localAddress.port, localAddress.address.hostAddress)
        } else {
            SocketDescriptor()
        }
        peer.Startup(maxConnections, sd, 1).let { result ->
            if (StartupResult.RAKNET_STARTED != result && StartupResult.RAKNET_ALREADY_STARTED != result) {
                throw RuntimeException("Cannot start RakNet: $result")
            }
        }
    }

    protected abstract fun processPacket(packet: RakPacket)

    companion object {
        private val metadata = ChannelMetadata(true)
    }

    protected open inner class RakNetUnsafeImpl : AbstractChannel.AbstractUnsafe(), RakNetUnsafe {

        override fun processPacket(packet: RakPacket) {
            this@RakNetAbstractChannel.processPacket(packet)
        }

        override fun connect(remoteAddress: SocketAddress, localAddress: SocketAddress?, promise: ChannelPromise) {
            throw NotImplementedError()
        }


    }

}