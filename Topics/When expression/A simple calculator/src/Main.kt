fun main() {
    val (number1, operator, number2) = readln().split(" ")
    println(
        when (operator) {
            "+" -> number1.toLong() + number2.toLong()
            "-" -> number1.toLong() - number2.toLong()
            "*" -> number1.toLong() * number2.toLong()
            "/" -> if (number2.toInt() == 0) {
                "Division by 0!"
            } else number1.toLong() / number2.toLong()
            else -> "Unknown operator"
        }
    )
}