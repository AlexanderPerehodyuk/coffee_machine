class CoffeeMachine() {
    private val espresso = listOf<Int>(250, 0, 16, 4)
    private val latte = listOf<Int>(350, 75, 20, 7)
    private val cappuccino = listOf<Int>(200, 100, 12, 6)
    var hasMilk = 540
    var hasWater = 400
    var hasBeans = 120
    var hasCups = 9
    var money = 550

    fun buy(choose: String = "1") {
        when (choose) {
            "1" -> {
                if (hasWater > espresso[0] || hasWater == espresso[0]) {
                    if (hasMilk > espresso[1] || hasMilk == espresso[1]) {
                        if (hasBeans > espresso[2] || hasBeans == espresso[2]) {
                            if (hasCups > 0) {
                                println("I have enough resources, making you a coffee!")
                                hasCups -= 1
                                hasWater -= espresso[0]
                                hasMilk -= espresso[1]
                                hasBeans -= espresso[2]
                                money += espresso[3]
                            } else {
                                println("Sorry, not enough cups!")
                            }
                        } else {
                            println("Sorry, not enough coffee beans!")
                        }
                    } else {
                        println("Sorry, not enough milk!")
                    }
                } else {
                    println("Sorry, not enough water!")
                }
            }
            "2" -> {
                if (hasWater > latte[0] || hasWater == latte[0]) {
                    if (hasMilk > latte[1] || hasMilk == latte[1]) {
                        if (hasBeans > latte[2] || hasBeans == latte[2]) {
                            if (hasCups > 0) {
                                println("I have enough resources, making you a coffee!")
                                hasCups -= 1
                                hasWater -= latte[0]
                                hasMilk -= latte[1]
                                hasBeans -= latte[2]
                                money += latte[3]
                            } else {
                                println("Sorry, not enough cups!")
                            }
                        } else {
                            println("Sorry, not enough coffee beans!")
                        }
                    } else {
                        println("Sorry, not enough milk!")
                    }
                } else {
                    println("Sorry, not enough water!")
                }
            }
            "3" -> {
                if (hasWater > cappuccino[0] || hasWater == cappuccino[0]) {
                    if (hasMilk > cappuccino[1] || hasMilk == cappuccino[1]) {
                        if (hasBeans > cappuccino[2] || hasBeans == cappuccino[2]) {
                            if (hasCups > 0) {
                                println("I have enough resources, making you a coffee!")
                                hasCups -= 1
                                hasWater -= cappuccino[0]
                                hasMilk -= cappuccino[1]
                                hasBeans -= cappuccino[2]
                                money += cappuccino[3]
                            } else {
                                println("Sorry, not enough cups!")
                            }
                        } else {
                            println("Sorry, not enough coffee beans!")
                        }
                    } else {
                        println("Sorry, not enough milk!")
                    }
                } else {
                    println("Sorry, not enough water!")
                }
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
        println("$hasBeans  g of coffee beans")
        println("$hasCups disposable cups")
        println("$$money of money")
    }
}

fun main() {
    val machine = CoffeeMachine()
    var goOn = true
    var operation: String
    while (goOn) {
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
            "exit" -> goOn = false
        }
        println("")
    }
}