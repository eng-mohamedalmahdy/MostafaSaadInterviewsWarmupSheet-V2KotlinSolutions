fun main() {
    val (n, s) = readLongs(2)
    var res = s
    var res2 = 0
    repeat(n.toInt()) {
        val (sign, x) = readLn().split(" ")
        if (sign == "+") res += x.toLong()
        else if (sign == "-" && x.toLong() <= res) res -= x.toLong()
        else res2++
    }
    println("$res $res2")

}