fun main() {
    val number = readLine()!!.toInt()
    val range1 = readLine()!!.toInt()
    val range2 = readLine()!!.toInt()
    println(number in range1..range2)
}