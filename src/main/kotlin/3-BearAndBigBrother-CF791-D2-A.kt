fun main() = output {
    var (s, l) = readInts(2)
    var res = 0
    while (s <= l) {
        s *= 3
        l *= 2
        res++
    }
    res.println()
}

