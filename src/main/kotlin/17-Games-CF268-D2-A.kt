fun main() = output {
    val teams = readLines(readInt())
    var count = 0
    teams.forEach { outer ->
        val (home, _) = outer.split(" ")
        teams.forEach { inner ->
            val (_, guest2) = inner.split(" ")
            if (home == guest2) count++
        }
    }
    println(count)
}