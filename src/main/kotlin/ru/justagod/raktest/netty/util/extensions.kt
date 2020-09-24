package ru.justagod.raktest.netty.util

import ru.justagod.slikenet.ByteArray

fun ByteArray.toBytes(): kotlin.ByteArray {
    val res = ByteArray(this.size.toInt())

    for (i in 0 until size.toInt()) {
        res[i] = getByteAt(i.toLong()).toByte()
    }

    return res
}