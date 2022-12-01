fun main() = output {
    val input = readLines(readInt())
    var res = 1
    var last = ""
    input.forEach {
        res += if (last == it || last.isEmpty()) 0 else 1
        last = it
    }
    println(res)
}