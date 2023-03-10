fun main() {
    val a = readLine()
    val b = readLine()
    println(if (a == b) -1 else maxOf(a.length, b.length))
}
