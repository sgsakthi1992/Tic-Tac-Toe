fun main() {
    val count = readLine()!!.toInt()
    var min = readLine()!!.toInt()
    repeat(count - 1) {
        val number = readLine()!!.toInt()
        if (number < min) {
            min = number
        }
    }
    println(min)
}