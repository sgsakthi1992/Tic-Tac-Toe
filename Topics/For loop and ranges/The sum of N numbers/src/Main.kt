fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(numbers.sum())
}