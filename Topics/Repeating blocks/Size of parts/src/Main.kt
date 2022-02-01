fun main() {
    val n = readLine()!!.toInt()
    var (larger, smaller, perfect) = listOf(0, 0, 0)
    repeat(n) {
        when (readLine()!!.toInt()) {
            -1 -> smaller++
            1 -> larger++
            0 -> perfect++
        }
    }
    println("$perfect $larger $smaller")
}