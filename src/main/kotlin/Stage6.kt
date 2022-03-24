class CoffeeMachine() {
    private var hasMilk = 540
    private var hasWater = 400
    private var hasBeans = 120
    private var hasCups = 9
    private var money = 550

    private fun checkResources(water: Int = 0, milk: Int = 0, beans: Int = 0): Boolean {
        when {
            water > hasWater -> println("Sorry, not enough water!")
            milk > hasMilk -> println("Sorry, not enough milk!")
            beans > hasBeans -> println("Sorry, not enough coffee beans!")
            hasCups <= 0 -> println("Sorry, not enough cups!")
            else -> {
                println("I have enough resources, making you a coffee!")
                return true
            }
        }
        return false
    }

    private fun makeCoffee(type: String = "espresso") {
        hasCups -= 1
        when (type) {
            "espresso" -> {
                hasWater -= 250
                hasBeans -= 16
            }
            "latte" -> {
                hasWater -= 350
                hasMilk -= 75
                hasBeans -= 20
            }
            "cappuccino" ->{
                hasWater -= 200
                hasMilk -= 100
                hasBeans -= 12
            }
        }
    }

    fun buy(choose: String = "1") {
        when (choose) {
            "1" -> if (checkResources(water = 250, beans = 16)) {
                makeCoffee("espresso")
                money += 4
            }

            "2" -> if (checkResources(water = 350, milk = 75, beans = 20)) {
                makeCoffee("latte")
                money += 7
            }

            "3" -> if (checkResources(water = 200, milk = 100, beans = 12)) {
                makeCoffee("cappuccino")
                money += 6
            }
        }

    }

    fun fill() {
        print("\nWrite how many ml of water do you want to add: ")
        hasWater += readln().toInt()
        print("Write how many ml of milk do you want to add: ")
        hasMilk += readln().toInt()
        print("Write how many grams of coffee beans do you want to add: ")
        hasBeans += readln().toInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        hasCups += readln().toInt()
    }

    fun take() {
        println("I gave you $$money")
        money = 0
    }

    fun remaining() {
        println("\nThe coffee machine has:")
        println("$hasWater ml of water")
        println("$hasMilk ml of milk")
        println("$hasBeans g of coffee beans")
        println("$hasCups disposable cups")
        println("$$money of money")
    }
}

fun main() {
    val machine = CoffeeMachine()
    var operation: String
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): > ")
        operation = readln()
        when (operation) {
            "buy" -> {
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                machine.buy(readln())
            }
            "fill" -> machine.fill()
            "take" -> machine.take()
            "remaining" -> machine.remaining()
            "exit" -> break
        }
        println("")
    }
}