fun main() {
    val coins = readInts(readInt()).sortedDescending()
    val halfSum = coins.sum() / 2.0
    var runningSum = 0
    coins.forEachIndexed { idx, i ->
        runningSum += i
        if (runningSum > halfSum) {
            println(idx + 1)
            return
        }
    }

}