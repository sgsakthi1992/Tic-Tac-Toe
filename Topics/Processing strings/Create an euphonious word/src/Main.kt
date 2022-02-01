val VOWELS = listOf('a', 'e', 'i', 'o', 'u', 'y')

fun main() {
    val words = readln()
    var additionalChar = 0
    var previousChar = words[0]
    var i = 1
    while (i < words.lastIndex) {
        if (VOWELS.contains(previousChar) && VOWELS.contains(words[i]) && VOWELS.contains(words[i + 1])) {
            additionalChar++
            i++
        } else if (!VOWELS.contains(previousChar) && !VOWELS.contains(words[i]) && !VOWELS.contains(words[i + 1])) {
            additionalChar++
            i++
        }
        previousChar = words[i]
        i++
    }
    println(additionalChar)
}