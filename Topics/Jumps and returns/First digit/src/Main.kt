fun main() {
    val word = readln()
    for (i in word) {
        if (Character.isDigit(i)) {
            println(i)
            break
        }
    }
}