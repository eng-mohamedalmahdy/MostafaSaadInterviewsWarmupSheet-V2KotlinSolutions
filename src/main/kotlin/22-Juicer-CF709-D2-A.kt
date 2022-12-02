fun main() {
    val max = readInts(2).maxOrNull() ?: return
    when (max) {
        1 -> "1/1"
        2 -> "5/6"
        3 -> "2/3"
        4 -> "1/2"
        5 -> "1/3"
        6 -> "1/6"
        else -> "0/1"
    }.println()

}