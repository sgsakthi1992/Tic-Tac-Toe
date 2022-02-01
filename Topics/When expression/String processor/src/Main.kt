fun main() {
    val word1 = readln()
    val operation = readln()
    val word2 = readln()
    println(
        when (operation) {
            "equals" -> word1 == word2
            "plus" -> word1 + word2
            "endsWith" -> word1.endsWith(word2)
            else -> "Unknown operation"
        }
    )
}