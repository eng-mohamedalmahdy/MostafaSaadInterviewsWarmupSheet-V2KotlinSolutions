fun main() {
    val st = readLongs(readInt())
    val min = st.min()
    val max = st.max()
    st.fold(0) { acc, i -> acc + if (i == min || i == max) 0 else 1 }.println()
}