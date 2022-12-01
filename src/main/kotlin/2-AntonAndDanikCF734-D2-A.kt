import java.util.Stack

fun main() = output {
    val n = readInt()
    val input = readLn()
    val result = Stack<Char>()
    input.forEach {
        if (result.empty() || result.peek() == it) result.push(it)
        else result.pop()
    }
    (if (result.isEmpty()) "Friendship" else if (result.peek() == 'A') "Anton" else "Danik")
        .println()
}