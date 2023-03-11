fun main() {
    List(readInt()) { Triple(readInt(), readInt(), readInt()) }
        .reduce { acc, i -> Triple(acc.first + i.first, acc.second + i.second, i.third + acc.third) }
        .map { it.first == 0 && it.second == 0 && it.third == 0 }
        .map { if (it) "YES" else "NO" }
        .println()
}
