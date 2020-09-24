package ru.justagod.raktest.netty.channel

import io.netty.channel.Channel
import io.netty.channel.ChannelOutboundBuffer
import ru.justagod.raktest.driver.RakOutboundPacket
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.selection.SelectableRakPeer
import ru.justagod.raktest.netty.util.FastSystemAddress
import ru.justagod.slikenet.AddressOrGUID
import ru.justagod.slikenet.ConnectionState
import java.net.InetSocketAddress
import java.net.SocketAddress

class RakNetChildChannel(
    parent: RakNetServerChannel,
    private val remoteAddress: FastSystemAddress
) : RakNetAbstractChannel(parent) {

    private val socketRemoteAddress = obtainRemoteAddress()

    private fun obtainRemoteAddress(): InetSocketAddress {
        val str = remoteAddress.systemAddress.ToString(true, '|').split('|')

        return InetSocketAddress(str[0], str[1].toInt())
    }

    override fun peer(): SelectableRakPeer = parent().peer()

    override fun isOpen(): Boolean = true

    override fun isActive(): Boolean {
        val state = parent().peer().peer.GetConnectionState(AddressOrGUID(remoteAddress.systemAddress))

        return state == ConnectionState.IS_CONNECTED
    }

    override fun localAddress0(): SocketAddress = parent().localAddress()

    override fun remoteAddress0(): SocketAddress = socketRemoteAddress


    override fun doBind(localAddress: SocketAddress?) {
        throw NotImplementedError()
    }

    override fun doDisconnect() {
        parent().peer().peer.CloseConnection(AddressOrGUID(remoteAddress.systemAddress), true)
    }

    override fun doClose() {
        // Child shouldn't close peer
    }

    override fun doWrite(input: ChannelOutboundBuffer) {
        var msg = input.current() as RakOutboundPacket?

        while (msg != null) {
            // мне не нравится
            val arr = msg.data.array()
            peer().peer.Send(
                String(arr),
                arr.size,
                msg.priority,
                msg.reliability,
                (0).toChar(),
                AddressOrGUID(remoteAddress.systemAddress),
                false
            )
            input.remove()
            msg = input.current() as RakOutboundPacket?
        }
    }

    override fun doRegister() {
        eventLoop().registerSelector(parent().peer().makeSelector(remoteAddress, this))
    }

    override fun parent() = super.parent() as RakNetServerChannel

    override fun processPacket(packet: RakPacket) {
        pipeline().fireChannelRead(packet)
    }

}