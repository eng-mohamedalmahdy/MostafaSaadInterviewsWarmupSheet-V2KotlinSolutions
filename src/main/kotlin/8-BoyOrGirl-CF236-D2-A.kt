fun main() = output {
    val input = readLn().toHashSet()
    println(if (input.size % 2 == 0) "CHAT WITH HER!" else "IGNORE HIM!")
}