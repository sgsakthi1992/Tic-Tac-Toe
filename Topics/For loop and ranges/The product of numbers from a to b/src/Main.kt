fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var result: Long = 1
    for (i in a until b) {
        result *= i
    }
    println(result)
}