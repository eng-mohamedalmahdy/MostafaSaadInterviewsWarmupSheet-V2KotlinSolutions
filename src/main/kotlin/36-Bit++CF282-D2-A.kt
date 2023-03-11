fun main() {
    readLines(readInt())
        .fold(0) { acc, s -> if (s[1] == '+') acc + 1 else if (s[1] == '-') acc - 1 else acc }
        .println()
}