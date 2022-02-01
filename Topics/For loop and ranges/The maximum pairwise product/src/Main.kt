fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    var max = numbers.first()
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (max < numbers[i] * numbers[j]) {
                max = numbers[i] * numbers[j]
            }
        }
    }
    println(max)
}