import kotlin.math.abs

fun main() = output {
    val word = readLn()
    var currLetter = 'a'
    var steps = 0

    word.forEach {

        val cw = abs(it.code - currLetter.code)
        val ccw = abs(26 - cw)
        steps += minOf(cw, ccw)
        currLetter = it
    }
    println(steps)
}


