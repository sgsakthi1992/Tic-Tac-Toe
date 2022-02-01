fun main() {
    val word = readln()
    val substring = readln()
    println(word.split(substring).size - 1)
}