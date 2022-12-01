fun main() = output {
    val n = readInt()
    val h = readInt()
    val arr = readInts(n)
    arr.fold(0) { acc, i -> acc + if (i > h) 2 else 1 }.println()
}