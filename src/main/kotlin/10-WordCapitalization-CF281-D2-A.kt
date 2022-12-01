import java.util.*

fun main() = output {
    readLn()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        .println()
}