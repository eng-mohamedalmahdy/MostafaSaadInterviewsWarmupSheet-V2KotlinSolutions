import java.util.ArrayDeque

fun main() = output {
    val n = readInt()
    val row = readInts(n)
    val dq = ArrayDeque(row)
    var c = 0
    var c2 = 0
    var isCTurn = true
    while (dq.isNotEmpty()) {
        if (dq.peekLast() > dq.peekFirst()) {
            if (isCTurn) c += dq.pollLast()
            else {
                c2 += dq.pollLast()
            }
        } else {
            if (isCTurn) c += dq.pollFirst()
            else {
                c2 += dq.pollFirst()
            }
        }
        isCTurn = !isCTurn

    }
    println("$c $c2")
}