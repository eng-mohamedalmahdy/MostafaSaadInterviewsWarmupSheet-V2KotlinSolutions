fun main() = output {
    val cals = readStrings(4)
    val actions = readLn()
    actions.fold(0) { acc, c -> acc + cals[c.digitToInt() - 1].toInt() }.println()
}