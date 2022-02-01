fun main() {
    val word = readLine()!!.map { it.toString() }
    val newWord = mutableListOf<String>()
    for (i in word) {
        repeat(2) {
            newWord.add(i)
        }
    }
    println(newWord.joinToString(""))
}