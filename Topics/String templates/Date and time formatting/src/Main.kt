import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val timestamp = scanner.nextLine()
    val date = scanner.nextLine()
    print("${timestamp.replace(" ", ":")} ${date.replace(" ", "/")}")
}