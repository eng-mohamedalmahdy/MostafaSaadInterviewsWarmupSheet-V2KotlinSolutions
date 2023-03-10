fun main() {
    val (n, k) = readInts(2)
    val entries =  readInts(n)
    val sortedEntries = listOf(0) + entries.sorted().reversed()
    val lastWinnerScore = sortedEntries[k]
    sortedEntries.fold(0) { acc, i -> if (i >= lastWinnerScore && i > 0) acc + 1 else acc }.println()
}