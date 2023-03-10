fun main() {
    val n = readInt()
    val days = readInts(n)
    val acquired = Array(n + 1) { false }
    var ptr = n
    days.forEach {
        acquired[it] = true
        while (acquired[ptr]) print("${ptr--} ")
        println()
    }
}