fun main() = output {
    val (n, t, k, d) = readInts(4)
    val g = (n + k - 1) / k
    var o1 = 0
    var o2 = d
    for (i in 0 until g) {
        if (o1 <= o2) o1 += t
        else o2 += t
    }
    if (o1.maxBy(o2) < g*t) println("YES")
    else println("NO")
}