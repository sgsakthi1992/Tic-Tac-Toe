fun sum(number: List<Int>, range: IntRange): Int {
    var sum = 0
    for (i in range) {
        sum += number[i]
    }
    return sum
}

fun main() {
    val number = readLine()!!.map { it.code }.toList()
    println(
        if (sum(number, 0..number.lastIndex / 2) == sum(number, number.lastIndex / 2 + 1..number.lastIndex)) {
            "Lucky"
        } else "Regular"
    )
}