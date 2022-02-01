import kotlin.math.*

fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    println(
        if (abs(x1 - x2) == 1 && abs(y1 - y2) == 2) {
            "YES"
        } else if (abs(x1 - x2) == 2 && abs(y1 - y2) == 1) {
            "YES"
        } else {
            "NO"
        }
    )
}