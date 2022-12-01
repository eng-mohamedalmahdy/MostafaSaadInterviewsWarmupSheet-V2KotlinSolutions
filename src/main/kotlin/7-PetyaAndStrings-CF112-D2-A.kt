fun main() = output {

    val f = readLn()
    val s = readLn()
    val compare = f.compareTo(s, true)
    val res = when {
        compare == 0 -> 0
        compare > 0 -> 1
        else -> -1
    }
    println(res)
}