fun main() {
    val (firstName, lastName, age) = readLine()!!.split(" ")
    println("${firstName.first()}. $lastName, $age years old")
}