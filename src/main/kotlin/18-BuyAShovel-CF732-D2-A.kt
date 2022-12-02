fun main() = output {
    val (price, coin) = readInts(2)
    var res = 1
    while (true) {
        if ((price * res) % 10 == coin || (price * res) % 10 == 0) {
            break
        }
        res++
    }
    println(res)
}