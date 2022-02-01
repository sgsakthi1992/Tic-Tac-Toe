fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val numberToFind = readLine()!!.toInt()
    val count = numbers.count { it == numberToFind }
    println(count)
}