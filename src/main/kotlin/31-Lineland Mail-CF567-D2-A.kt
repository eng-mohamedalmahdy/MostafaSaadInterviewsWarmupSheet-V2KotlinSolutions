import kotlin.math.absoluteValue

fun main() {
    val cities = readLongs(readInt())
    cities.forEachIndexed { idx, i ->

        val prev = cities[if (idx == 0) idx else idx - 1]
        val next = cities[if (idx == cities.lastIndex) idx else idx + 1]
        val first = cities.first()
        val last = cities.last()
        val distToPrev = (i - prev).absoluteValue
        val distToNext = (i - next).absoluteValue
        val distToFirst = (i - first).absoluteValue
        val distToLast = (i - last).absoluteValue
        val min = minOf(distToPrev, distToNext)
        val minNonZero = if (min == 0L) maxOf(distToPrev, distToNext) else min
        val max = maxOf(distToFirst, distToLast)
        println("$minNonZero $max")
    }
}