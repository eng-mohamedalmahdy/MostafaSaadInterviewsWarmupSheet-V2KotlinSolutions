fun main() = output {
    val wires = readInts(readInt()).toMutableList()
    val shots = readIntPairs(readInt())
    shots.forEach { (wire, bird) ->
        if (wire > 1) wires[wire - 2] += bird - 1;
        if (wire < wires.size) wires[wire] += wires[wire - 1] - bird;
        wires[wire - 1] = 0
    }
    wires.forEach(::println)
}