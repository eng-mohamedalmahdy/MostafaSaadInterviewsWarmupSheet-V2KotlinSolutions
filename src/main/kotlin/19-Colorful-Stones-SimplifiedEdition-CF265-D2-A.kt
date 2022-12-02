fun main() = output {
    val (line, inst) = readLines(2)
    inst
        .fold(0) { acc, c -> acc + if (c == line[acc]) 1 else 0 }
        .plus(1)
        .println()
}
