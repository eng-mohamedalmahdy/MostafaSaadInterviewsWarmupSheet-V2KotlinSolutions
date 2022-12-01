fun main() = output {
    val n = readInt()
    val eve = readInts(n)
    var crimes = 0
    var mb = 0
    eve.forEach {
        if (mb <= 0 && it == -1) crimes += 1
        else {
            mb += it
        }
    }
    println(crimes)
}
