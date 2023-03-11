import java.io.PrintWriter
import java.util.*
import javax.print.attribute.standard.MediaSize.Other
import kotlin.math.*

@JvmField
val INPUT = System.`in`

@JvmField
val OUTPUT = System.out

@JvmField
val _reader = INPUT.bufferedReader()
fun readLine(): String = _reader.readLine()
fun readLn() = _reader.readLine()!!

@JvmField
var _tokenizer: StringTokenizer = StringTokenizer("")
fun read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(_reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}

fun readInt() = read().toInt()
fun readDouble() = read().toDouble()
fun readLong() = read().toLong()
fun readStrings(n: Int) = List(n) { read() }
fun readChars(n: Int) = List(n) { read()[0] }
fun readLines(n: Int) = List(n) { readLn() }
fun readInts(n: Int) = List(n) { read().toInt() }
fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
fun readDoubles(n: Int) = List(n) { read().toDouble() }
fun readDoubleArray(n: Int) = DoubleArray(n) { read().toDouble() }
fun readLongs(n: Int) = List(n) { read().toLong() }
fun readLongArray(n: Int) = LongArray(n) { read().toLong() }
fun readIntPair() = Pair(readInt(), readInt())
fun readIntPairs(n: Int) = List(n) { readIntPair() }

fun <T : Comparable<T>> List<T>.lowerBound(key: T): Int {
    var l = -1
    var r = size
    while (l + 1 < r) {
        val m = l + r ushr 1
        if (this[m] >= key) r = m else l = m
    }
    return r
}

fun <T : Comparable<T>> List<T>.upperBound(key: T): Int {
    var l = -1
    var r: Int = size
    while (l + 1 < r) {
        val m = l + r ushr 1
        if (this[m] <= key) l = m else r = m
    }
    return l + 1
}

@JvmField
val _writer = PrintWriter(OUTPUT, false)
inline fun output(block: PrintWriter.() -> Unit) {
    _writer.apply(block).flush()
}

fun Int.maxBy(i: Int) = max(this, i)

@JvmName("prefixSumInt")
fun List<Int>.prefixSum(): List<Int> = this.runningFold(0) { acc, e -> acc + e }.drop(1)

@JvmName("prefixSumLong")
fun List<Long>.prefixSum(): List<Long> = this.runningFold(0L) { acc, e -> acc + e }.drop(1)
operator fun String.times(i: Int): String {
    var res = ""
    repeat(i) { res += this }
    return res
}

fun <T> T.println() = println(this)
fun Double.ceil() = ceil(this)
fun Double.floor() = floor(this)

