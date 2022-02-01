fun main() {
    var balance = readLine()!!.toInt()
    val amounts = readLine()!!.split(" ").map { it.toInt() }
    for ((index, amount) in amounts.withIndex()) {
        if (balance >= amount) {
            balance -= amount
            if (index == amounts.lastIndex) {
                println("Thank you for choosing us to manage your account! Your balance is $balance.")
            }
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $amount.")
        }
    }
}