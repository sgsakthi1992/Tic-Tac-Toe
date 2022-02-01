val VOWELS = listOf('a', 'e', 'i', 'o', 'u')

fun isVowel(letter: Char): Boolean = VOWELS.contains(letter.lowercaseChar())

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}