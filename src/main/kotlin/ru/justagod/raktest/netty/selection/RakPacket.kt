package ru.justagod.raktest.netty.selection

import ru.justagod.raktest.netty.util.FastSystemAddress
import ru.justagod.slikenet.Packet

class RakPacket(val packet: Packet) {

    val data = packet.dataArray()

    val address = FastSystemAddress(packet.systemAddress)

    fun type() = get(0)

    operator fun get(idx: Int): Int {
        if (idx > packet.length - 1) throw IndexOutOfBoundsException("got $idx; length ${packet.length}")
        if (idx < 0) throw IndexOutOfBoundsException("got $idx; less than 0")

        return data.getByteAt(idx.toLong()).toInt()
    }



}