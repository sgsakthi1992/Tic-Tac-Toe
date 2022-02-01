fun main() {
    val number = readLine()!!.toInt()
    val divisibleBy = arrayOf( 2, 3, 5, 6 )
    for (i in divisibleBy) {
        if (number % i == 0) {
            println("Divided by $i")
        }
    }
}