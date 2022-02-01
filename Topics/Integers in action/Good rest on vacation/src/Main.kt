fun main() {
    val duration = readLine()!!.toInt()
    val foodCostPerDay = readLine()!!.toInt()
    val oneWayFlightCost = readLine()!!.toInt()
    val hotelCostPerNight = readLine()!!.toInt()

    val totalFoodCost = foodCostPerDay * duration
    val totalFlightCost = oneWayFlightCost * 2
    val totalHotelCost = hotelCostPerNight * (duration - 1)

    println(totalFoodCost + totalFlightCost + totalHotelCost)
}