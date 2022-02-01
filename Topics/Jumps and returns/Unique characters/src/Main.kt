fun main() {
    val word = readln().toMutableList()
    var uniqueWords = 0
    for (i in word) {
        if (word.count { it == i } == 1) {
            uniqueWords++
        }
    }
    println(uniqueWords)
}