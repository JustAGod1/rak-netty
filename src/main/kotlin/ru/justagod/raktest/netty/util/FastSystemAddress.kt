package ru.justagod.raktest.netty.util

import ru.justagod.slikenet.SystemAddress

class FastSystemAddress(val systemAddress: SystemAddress) {

    private val string = systemAddress.ToString(true, '|')

    override fun hashCode(): Int = string.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other !is FastSystemAddress) return false
        return other.string == string
    }
}