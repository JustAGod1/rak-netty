package ru.justagod.raktest.netty.loop

import io.netty.channel.EventLoop
import io.netty.channel.MultithreadEventLoopGroup
import java.util.concurrent.Executor

class RakNetEventLoopGroup(nThreads: Int, executor: Executor?, ioRatio: Int) :
    MultithreadEventLoopGroup(nThreads, executor, ioRatio) {

    constructor(nThreads: Int, executor: Executor): this(nThreads, executor, 50)
    constructor(nThreads: Int): this(nThreads, null, 50)



    override fun newChild(executor: Executor, vararg args: Any): EventLoop {
        return RakNetEventLoop(
            this,
            executor,
            true,
            args[0] as Int
        )
    }
}