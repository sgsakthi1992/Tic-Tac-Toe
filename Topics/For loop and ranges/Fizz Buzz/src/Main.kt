const val THREE = 3
const val FIVE = 5
fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    for (i in number1..number2) {
        when {
            i % THREE == 0 && i % FIVE == 0 -> println("FizzBuzz")
            i % THREE == 0 -> println("Fizz")
            i % FIVE == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}