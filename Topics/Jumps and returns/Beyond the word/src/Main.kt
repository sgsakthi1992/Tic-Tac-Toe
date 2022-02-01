fun main() {
    val word = readln()
    println(('a'..'z').filter { !word.contains(it) }.joinToString(""))
}