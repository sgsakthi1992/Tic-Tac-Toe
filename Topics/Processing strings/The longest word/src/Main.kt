fun main() {
    val words = readln().split(" ")
    var longestWord = words[0]
    for (i in 1..words.lastIndex) {
        if (longestWord.length < words[i].length) {
            longestWord = words[i]
        }
    }
    println(longestWord)
}