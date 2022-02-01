fun main() {
    val (a, b, c) = readLine()!!.chunked(1)
    println(a.toInt() + b.toInt() + c.toInt())
}