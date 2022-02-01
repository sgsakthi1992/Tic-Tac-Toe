fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    val sum = numbers.sum()
    numbers.add(0, sum)
    numbers.removeAt(numbers.lastIndex - 1)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}