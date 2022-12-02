fun main() {
    val players = readInts(readInt()).foldIndexed(MutableList(3) { mutableListOf<Int>() }) { index, acc, i ->
        acc.apply { acc[i - 1] += index+1 }
    }
    val teams = players[0].zip(players[1])
        .zip(players[2]) { (programmer, mathematician), sportsman -> Triple(programmer, mathematician, sportsman) }

    println(teams.size)
    teams.forEach { println("${it.first} ${it.second} ${it.third}") }

}