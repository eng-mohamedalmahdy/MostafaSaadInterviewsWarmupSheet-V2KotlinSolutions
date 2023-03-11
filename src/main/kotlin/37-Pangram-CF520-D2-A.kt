fun main() {
    readInt()
    readLine()
        .lowercase()
        .toSet()
        .map { it.size == 26 }
        .map { if (it) "YES" else "NO" }
        .println()
}