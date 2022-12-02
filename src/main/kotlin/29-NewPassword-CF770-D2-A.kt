fun main() = output {
    val (n, k) = readInts(2)
    val alphabet = 'a'..'z'
    (alphabet.fold("") { acc, c -> acc + c }.substring(0,k) * 100).substring(0,n).println()
}