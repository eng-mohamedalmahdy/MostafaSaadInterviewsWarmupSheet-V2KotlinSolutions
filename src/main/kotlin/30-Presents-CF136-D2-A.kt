fun main() {
    val list: List<Int> = listOf(0) + readInts(readInt())
    List(list.size) { index -> list.indexOf(index) }
        .takeLast(list.size - 1)
        .forEach { print("$it ") }
}
