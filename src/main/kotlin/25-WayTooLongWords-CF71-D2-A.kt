fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val word = readLine()!!
        if (word.length > 10) {
            println("${word.first()}${word.length - 2}${word.last()}")
        } else {
            println(word)
        }
    }
}