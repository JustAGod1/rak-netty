package ru.justagod.raktest.netty.loop

import io.netty.channel.EventLoopGroup
import io.netty.channel.SingleThreadEventLoop
import ru.justagod.raktest.netty.channel.RakNetAbstractChannel
import ru.justagod.raktest.netty.channel.RakNetUnsafe
import ru.justagod.raktest.netty.selection.RakPacket
import ru.justagod.raktest.netty.selection.SelectableRakPeer
import java.util.concurrent.Executor

class RakNetEventLoop(
    parent: EventLoopGroup,
    executor: Executor,
    addTaskWakesUp: Boolean,
    protected val ioRatio: Int
) :
    SingleThreadEventLoop(parent, executor, addTaskWakesUp) {


    private val selectors = arrayListOf<SelectableRakPeer.RakPeerSelector>()

    fun registerSelector(selector: SelectableRakPeer.RakPeerSelector) {
        selectors += selector
    }

    override fun run() {
        while (true) {
            try {
                if (ioRatio == 100) {
                    try {
                        processPackets(selectPackets(MAX_SELECTION_TIME))
                    } finally {
                        runAllTasks()
                    }
                } else {
                    val ioStartTime = System.nanoTime()
                    try {
                        processPackets(selectPackets(MAX_SELECTION_TIME))
                    } finally {
                        // Ensure we always run tasks.
                        val ioTime = System.nanoTime() - ioStartTime
                        runAllTasks(ioTime * (100 - ioRatio) / ioRatio)
                    }
                }
            } catch (e: Throwable) {
                e.printStackTrace()

                // idk why I have to sleep but netty said I have to
                Thread.sleep(1000)
            }

            try {
                if (isShuttingDown) {
                    closeAll()
                    if (confirmShutdown()) return
                }
            } catch (e: Throwable) {
                e.printStackTrace()

            }

        }
    }

    private fun selectPackets(timeLimit: Long): List<Pair<RakPacket, RakNetAbstractChannel>> {
        val start = System.currentTimeMillis()
        var elapsed = 0L
        val result = arrayListOf<Pair<RakPacket, RakNetAbstractChannel>>()

        synchronized(selectors) {
            while (elapsed < timeLimit) {
                for (selector in selectors) {
                    result += (selector.next() ?: continue) to selector.channel
                }
                elapsed = System.currentTimeMillis() - start
            }
        }

        if (result.isEmpty()) {
            val firstSelector = selectors.firstOrNull()
            firstSelector?.select()
        }

        return result
    }


    private fun processPackets(packets: List<Pair<RakPacket, RakNetAbstractChannel>>) {
        for ((packet, channel) in packets) {
            processPacket(packet, channel)

            channel.peer().peer.DeallocatePacket(packet.packet)
        }
    }

    private fun processPacket(packet: RakPacket, channel: RakNetAbstractChannel) {
        val unsafe = channel.unsafe() as RakNetUnsafe
        unsafe.processPacket(packet)
    }

    private fun closeAll() {
        synchronized(selectors) {
            for (selector in selectors) {
                selector.channel.unsafe().close(selector.channel.unsafe().voidPromise())
            }
        }
    }

    companion object {
        private const val MAX_SELECTION_TIME = 100L
    }
}