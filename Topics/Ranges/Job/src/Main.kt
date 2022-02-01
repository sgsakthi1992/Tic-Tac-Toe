const val MIN_AGE = 18
const val MAX_AGE = 59
fun main() {
    val age = readLine()!!.toInt()
    println(age in MIN_AGE..MAX_AGE)
}