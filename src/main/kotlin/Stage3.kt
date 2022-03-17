import java.lang.Double.min

fun main() {
    print("Write how many ml of water the coffee machine has: ")
    val hasWater = readLine()!!.toDouble()
    print("Write how many ml of milk the coffee machine has: ")
    val hasMilk = readLine()!!.toDouble()
    print("Write how many grams of beans the coffee machine has: ")
    val hasBeans = readLine()!!.toDouble()
    val water = 200
    val milk = 50
    val beans = 15
    var canMakeCups = 0
    print("Write how many cups of coffee you will need: ")
    val cups = readLine()!!.toInt()
    canMakeCups = min(hasWater / water, hasMilk / milk).toInt()
    canMakeCups = min(canMakeCups.toDouble(), hasBeans / beans).toInt()

    if (canMakeCups == cups) println("Yes, I can make that amount of coffee")
    if (canMakeCups > cups) {
        canMakeCups -= cups
        println("Yes, I can make that amount of coffee (and even $canMakeCups than that)")
    }
    if (canMakeCups < cups) {
        println("No, I can make only $canMakeCups cup(s) of coffee")
    }
}