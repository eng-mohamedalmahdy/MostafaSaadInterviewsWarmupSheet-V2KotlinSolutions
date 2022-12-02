fun main() = output {
    readLn()
        .split("+")
        .sorted()
        .fold("") { acc, s -> "$acc$s+" }
        .dropLast(1)
        .println()
}
