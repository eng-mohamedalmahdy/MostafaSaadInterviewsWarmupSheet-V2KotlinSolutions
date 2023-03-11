fun main() {
    val kb = listOf(
        "qwertyuiop",
        "asdfghjkl;",
        "zxcvbnm,./"
    )
    val shift = readLine()
    val entries = readLine()
    entries.forEach {
        val row = if (it in kb[0]) 0 else if (it in kb[1]) 1 else 2
        val idx = kb[row].indexOf(it)
        if (shift == "R") print(kb[row][idx - 1]) else print(kb[row][idx + 1])
    }
}