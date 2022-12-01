fun main() = output {
    val input = readLines(readInt())
    input.fold(0) { acc, s -> acc + if (s.count { it == '1' } > 1) 1 else 0 }.println()
}