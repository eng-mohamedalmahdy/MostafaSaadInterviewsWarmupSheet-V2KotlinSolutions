fun main() {
    readLn()
        .split("")
        .filterNot { it == "{" || it == "}" || it == "," || it == "" || it == " " }
        .toSet()
        .size
        .println()
}