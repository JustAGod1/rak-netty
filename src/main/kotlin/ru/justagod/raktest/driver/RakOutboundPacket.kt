package ru.justagod.raktest.driver

import io.netty.buffer.ByteBuf
import ru.justagod.slikenet.PacketPriority
import ru.justagod.slikenet.PacketReliability

class RakOutboundPacket(
    val data: ByteBuf,
    val reliability: PacketReliability,
    val priority: PacketPriority
)