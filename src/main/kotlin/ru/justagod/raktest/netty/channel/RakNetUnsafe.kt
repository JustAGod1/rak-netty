package ru.justagod.raktest.netty.channel

import io.netty.channel.Channel
import ru.justagod.raktest.netty.selection.RakPacket

// Netty insists to move all internal methods to Unsafe, so why not?
interface RakNetUnsafe : Channel.Unsafe {

    // In Netty a lot of packets-processing code is written inside event loops
    // but for me is much more convenient to do it inside channel code
    fun processPacket(packet: RakPacket)

}