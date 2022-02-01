fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val rotateValue = readLine()!!.toInt()
    for (i in 1..rotateValue % numbers.size) {
        numbers.add(0, numbers.last())
        numbers.removeAt(numbers.lastIndex)
    }
    println(numbers.joinToString(" "))
}