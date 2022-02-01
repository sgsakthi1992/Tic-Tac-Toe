fun main() {
    val n = readLine()!!.toInt()
    var (a, b, c, d) = listOf(0, 0, 0, 0)
    repeat(n) {
        when (readLine()!!.toInt()) {
            5 -> a++
            4 -> b++
            3 -> c++
            2 -> d++
        }
    }
    println("$d $c $b $a")
}