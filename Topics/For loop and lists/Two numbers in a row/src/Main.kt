fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine() }.joinToString("")
    val items = readLine()!!.split(" ").joinToString("")
    println(if (numbers.contains(items) || numbers.contains(items.reversed())) "NO" else "YES")
}