fun main() {
    val range1 = readLine()!!.toInt()
    val range2 = readLine()!!.toInt()
    val range3 = readLine()!!.toInt()
    val range4 = readLine()!!.toInt()
    val number = readLine()!!.toInt()
    println(number in range1..range2 && number in range3..range4)
}