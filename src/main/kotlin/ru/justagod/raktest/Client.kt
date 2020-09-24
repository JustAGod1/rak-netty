package ru.justagod.raktest

import io.netty.bootstrap.Bootstrap
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import ru.justagod.raktest.driver.RakOutboundPacket
import ru.justagod.raktest.netty.channel.RakNetClientChannel
import ru.justagod.raktest.netty.loop.RakNetEventLoopGroup
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.util.toBytes
import ru.justagod.slikenet.*
import java.net.InetSocketAddress
import java.net.Socket

object Client: ChannelInboundHandlerAdapter() {

    @JvmStatic
    fun main(args: Array<String>) {
        System.loadLibrary("slikenet_wrapper")

        val bootstrap = Bootstrap()

        bootstrap.channel(RakNetClientChannel::class.java)
        bootstrap.group(RakNetEventLoopGroup(4))
        bootstrap.handler(this)
        val channel = bootstrap.connect(InetSocketAddress("127.0.0.1", 5000)).sync().channel()

        val buf = Unpooled.copiedBuffer(byteArrayOf((DefaultMessageIDTypes.ID_USER_PACKET_ENUM.swigValue() + 1).toByte(),2,3,4,5))
        channel.writeAndFlush(RakOutboundPacket(buf, PacketReliability.RELIABLE, PacketPriority.HIGH_PRIORITY)).sync()
    }

    override fun channelRead(ctx: ChannelHandlerContext?, msg: Any?) {
        super.channelRead(ctx, msg)

        val pkt = msg as RakPacket

        println(pkt.data.toBytes().toList().toString())
    }
}