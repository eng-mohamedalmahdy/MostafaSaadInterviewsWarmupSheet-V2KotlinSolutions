import java.util.*

fun main() =
    output {
        val word = readLn()
        if (word.count { it.isUpperCase() } > word.count { it.isLowerCase() }) {
            word.uppercase(Locale.getDefault())
        } else {
            word.lowercase(Locale.getDefault())
        }
            .println()
    }

