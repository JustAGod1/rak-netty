package ru.justagod.raktest.netty.selection

import ru.justagod.raktest.netty.channel.RakNetAbstractChannel
import ru.justagod.raktest.netty.util.FastSystemAddress
import ru.justagod.raktest.netty.util.toBytes
import ru.justagod.slikenet.RakPeerInterface
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.LinkedBlockingQueue

class SelectableRakPeer(val peer: RakPeerInterface) {


    private val selectors = ConcurrentHashMap<FastSystemAddress, RakPeerSelector>()

    // We don't need to store more than one unowned packet
    // It always will be either login packet or packet with changed/spoofed ip
    private val unowned = ConcurrentHashMap<FastSystemAddress, PacketRef>()

    private var unownedSelector: RakPeerSelector? = null

    private var selectionFlag = false

    @Synchronized
    private fun captureFlag(): Boolean {
        return if (selectionFlag) false
        else {
            selectionFlag = true
            true
        }
    }

    private fun select(): Boolean {
        if (!captureFlag()) return false
        var pending = peer.GetReceiveBufferSize()

        while (pending > 0) {
            val packet = RakPacket(peer.Receive() ?: break)

            val ref = PacketRef(packet)
            val selector = selectors[packet.address]
            if (selector != null) {
                selector.push(ref)
            } else {
                // if unowned selector isn't assigned that means we don't accept incoming connections
                // so we don't need to accept unowned packet
                val unownedSelector = unownedSelector
                if (unownedSelector != null) {
                    // put packet only if its first come packet from that address
                    unowned.computeIfAbsent(packet.address) { ref }
                    unownedSelector.push(ref)
                }
            }

            pending--
        }
        selectionFlag = false
        return true
    }

    fun makeUnownedSelector(channel: RakNetAbstractChannel): RakPeerSelector {
        val selector = RakPeerSelector(channel)
        unownedSelector = selector

        return selector
    }

    fun makeSelector(address: FastSystemAddress, channel: RakNetAbstractChannel): RakPeerSelector {
        val selector = RakPeerSelector(channel)
        selectors[address] = selector
        val ref = unowned.remove(address)
        if (ref != null) {
            // We wont enter here if selector already was exist
            val packet = ref.drop()
            if (packet != null) {
                // there is a race condition when this packet can be not the first one in the newly created selector queue
                // I hope it wont happen
                selector.push(ref)
            }
        }
        return selector
    }

    // Needed for not to spend a lot of time for deleting packet from queue and map
    class PacketRef(packet: RakPacket) {
        var packet: RakPacket? = packet
            private set

        @Synchronized
        fun drop(): RakPacket? {
            val tmp = packet
            packet = null
            return tmp
        }
    }

    inner class RakPeerSelector(val channel: RakNetAbstractChannel)  {

        private val queue = LinkedBlockingQueue<PacketRef>()
        private var counter = 0

        @Synchronized
        fun push(packet: PacketRef) {
            counter++
            queue.offer(packet)
        }

        // caller is responsible for deallocating packet
        @Synchronized
        fun next(): RakPacket? {
            if (counter <= 0) return null
            var ref = queue.poll()
            counter--
            while (ref != null) {
                val pkt = ref.drop()
                if (pkt != null) return pkt

                ref = queue.poll()
                counter--
            }

            return null

        }

        fun select() = this@SelectableRakPeer.select()


    }


}