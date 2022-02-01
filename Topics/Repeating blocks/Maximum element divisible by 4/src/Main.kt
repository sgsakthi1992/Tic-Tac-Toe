fun main() {
    val n = readLine()!!.toInt()
    var max = 0
    repeat(n) {
        val next = readLine()!!.toInt()
        if (next % 4 == 0 && max < next) max = next
    }
    println(max)
}