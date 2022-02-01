fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    val temp = numbers.first()
    numbers[0] = numbers.last()
    numbers[numbers.lastIndex] = temp

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}