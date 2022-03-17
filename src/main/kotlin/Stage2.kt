fun main() {
    print("Write how many cups of coffee you will need: > ")
    val cups = readLine()!!.toInt()
    val water = 200 * cups
    val milk = 50 * cups
    val beans = 15 * cups
    println("For $cups cups of coffee you will need:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
}