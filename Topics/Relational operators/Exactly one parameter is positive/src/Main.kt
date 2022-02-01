fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val condition1 = number1 > 0 && number2 <= 0 && number3 <= 0
    val condition2 = number2 > 0 && number1 <= 0 && number3 <= 0
    val condition3 = number3 > 0 && number1 <= 0 && number2 <= 0

    println(condition1 || condition2 || condition3)
}