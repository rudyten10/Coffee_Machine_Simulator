var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun main() {
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        when (readLine()!!) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> stats()
            "exit" -> break
            else -> println("Error!")
        }
    }
}

fun buy() {
    val str = "Sorry, not enough"

    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    when (readLine()!!) {
        "1" -> {
            if (water < 250) println("$str water!")
            else if (beans < 16) println("$str coffee beans!")
            else if (cups < 1) println("$str cups!")
            else {
                water -= 250
                milk -= 0
                beans -= 16
                cups -= 1
                money += 4
                println("I have enough resources, making you a coffee!")
            }
        }
        "2" -> {
            if (water < 350) println("$str water!")
            else if (milk < 75) println("$str milk!")
            else if (beans < 20) println("$str coffee beans!")
            else if (cups < 1) println("$str cups!")
            else {
                water -= 350
                milk -= 75
                beans -= 20
                cups -= 1
                money += 7
                println("I have enough resources, making you a coffee!")
            }
        }
        "3" -> {
            if (water < 220) println("$str water!")
            else if (milk < 100) println("$str milk!")
            else if (beans < 12) println("$str coffee beans!")
            else if (cups < 1) println("$str cups!")
            else {
                water -= 200
                milk -= 100
                beans -= 12
                cups -= 1
                money += 6
                println("I have enough resources, making you a coffee!")
            }
        }
    }
}

fun fill() {
    val str1 = "Write how many"
    val str2 = "do you want to add: "

    print("$str1 ml of water $str2")
    water += readLine()!!.toInt()
    print("$str1 ml of milk $str2")
    milk += readLine()!!.toInt()
    print("$str1 grams of coffee beans $str2")
    beans += readLine()!!.toInt()
    print("$str1 disposable cups of coffee $str2")
    cups += readLine()!!.toInt()
}

fun take() {
    println("I gave you $$money")
    money = 0
}

fun stats() {
    println(
        "The coffee machine has:\n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$beans of coffee beans\n" +
                "$cups of disposable cups\n" +
                "$money of money"
    )
}
