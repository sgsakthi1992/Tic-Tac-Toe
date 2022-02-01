fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val hours = totalSeconds % 24
    val minutes = hours % 60
    val seconds = minutes % 60
    println("$hours:$minutes:$seconds")

}