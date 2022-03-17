fun main() {
    val espresso = listOf<Int>(250, 0, 16, 4)
    val latte = listOf<Int>(350, 75, 20, 7)
    val cappuccino = listOf<Int>(200, 100, 12, 6)
    var hasMilk = 540
    var hasWater = 400
    var hasBeans = 120
    var hasCups = 9
    var money = 550
    println("The coffee machine has:")
    println("$hasWater ml of water")
    println("$hasMilk ml of milk")
    println("$hasBeans  g of coffee beans")
    println("$hasCups disposable cups")
    println("$$money of money\n")
    print("Write action (buy, fill, take): ")
    val operation: String = readln()
    when (operation) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            when (readln()) {
                "1" -> {
                    hasCups -= 1
                    hasWater -= espresso[0]
                    hasMilk -= espresso[1]
                    hasBeans -= espresso[2]
                    money += espresso[3]
                }
                "2" -> {
                    hasCups -= 1
                    hasWater -= latte[0]
                    hasMilk -= latte[1]
                    hasBeans -= latte[2]
                    money += latte[3]
                }
                "3" -> {
                    hasCups -= 1
                    hasWater -= cappuccino[0]
                    hasMilk -= cappuccino[1]
                    hasBeans -= cappuccino[2]
                    money += cappuccino[3]
                }
            }
        }
        "fill" -> {
            print("Write how many ml of water do you want to add: ")
            hasWater += readln().toInt()
            print("Write how many ml of milk do you want to add: ")
            hasMilk += readln().toInt()
            print("Write how many grams of coffee beans do you want to add: ")
            hasBeans += readln().toInt()
            print("Write how many disposable cups of coffee do you want to add: ")
            hasCups += readln().toInt()
        }
        "take" -> {
            println("I gave you $$money")
            money = 0
        }
    }
    println("\nThe coffee machine has:")
    println("$hasWater ml of water")
    println("$hasMilk ml of milk")
    println("$hasBeans  g of coffee beans")
    println("$hasCups disposable cups")
    println("$$money of money")
}