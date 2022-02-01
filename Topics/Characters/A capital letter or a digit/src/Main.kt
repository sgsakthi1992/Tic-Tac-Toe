fun main() {
    val input = readLine()!!.first()
    println(input != '0' && input.isDigit() || input.isUpperCase())
}