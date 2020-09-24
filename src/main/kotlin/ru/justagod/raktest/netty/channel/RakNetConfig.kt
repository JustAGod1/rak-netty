package ru.justagod.raktest.netty.channel

import io.netty.channel.DefaultChannelConfig

class RakNetConfig(channel: RakNetServerChannel) : DefaultChannelConfig(channel) {

    var maxConnections = 100

}