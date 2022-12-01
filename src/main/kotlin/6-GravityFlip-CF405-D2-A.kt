fun main() = output {
    val size = readInt()
    val square = readIntArray(size)
    square.sorted().forEach { print("$it ") }
}