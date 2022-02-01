const val NUMBER_OF_CHARACTERS = 4
fun main() {
    repeat(NUMBER_OF_CHARACTERS) {
        println(readLine()!!.first().isDigit())
    }
}