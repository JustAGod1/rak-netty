package ru.justagod.raktest

import io.netty.bootstrap.ServerBootstrap
import io.netty.buffer.Unpooled
import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import ru.justagod.raktest.driver.RakOutboundPacket
import ru.justagod.raktest.netty.channel.RakNetServerChannel
import ru.justagod.raktest.netty.loop.RakNetEventLoopGroup
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.util.toBytes
import ru.justagod.slikenet.PacketPriority
import ru.justagod.slikenet.PacketReliability
import java.util.concurrent.Executors

object Server: ChannelInboundHandlerAdapter() {

    @JvmStatic
    fun main(args: Array<String>) {
        System.loadLibrary("slikenet_wrapper")
        val bootstrap = ServerBootstrap()
        bootstrap.channel(RakNetServerChannel::class.java)
        bootstrap.group(RakNetEventLoopGroup(4))

        bootstrap.childHandler(object : ChannelInitializer<Channel>() {
            override fun initChannel(ch: Channel) {
                ch.pipeline().addLast(this@Server)
            }
        })

        bootstrap.bind(5000).sync()


    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any?) {
        super.channelRead(ctx, msg)

        val pkt = msg as RakPacket
        val buf = Unpooled.copiedBuffer(pkt.data.toBytes())
        ctx.channel().writeAndFlush(RakOutboundPacket(buf, PacketReliability.RELIABLE, PacketPriority.HIGH_PRIORITY)).sync()
    }

}