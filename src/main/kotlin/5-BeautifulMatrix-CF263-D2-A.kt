import kotlin.math.abs

fun main() = output {
    val arr = Array(5) { readIntArray(5) }
    var idx = Pair(-1, -1)
    arr.forEachIndexed { i, row ->
        row.forEachIndexed { j, cell ->
            if (cell == 1) idx = Pair(i, j)
        }
    }
    println(abs(idx.first - 2) + abs(idx.second - 2))
}