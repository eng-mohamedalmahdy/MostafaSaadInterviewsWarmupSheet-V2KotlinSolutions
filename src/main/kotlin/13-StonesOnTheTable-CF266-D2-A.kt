fun main() = output {
    readInt()
    var input = StringBuilder(readLn())
    var res = 0
    var ptr = 1
    while (ptr < input.length) {
        if (input.length > 1 && input[ptr] == input[ptr - 1]) {
            input = input.deleteAt(ptr)
            res++
        }
        else ptr++
    }
    println(res)
}