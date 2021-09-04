package machine

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun main() {

    stats()
    println()
    action()
    println()
    stats()
}

fun action() {
    print("Write action (buy, fill, take): ")
    when (readLine()!!) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
        else -> println("Error!")
    }
}

fun buy() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino")
    when (readLine()!!.toInt()) {
        1 -> {
            water -= 250
            milk -= 0
            beans -= 16
            cups -= 1
            money += 4
        }
        2 -> {
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
        }
        3 -> {
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
        }
        else -> println("Error!")
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
    println("The coffee machine has:\n" +
            "$water of water\n" +
            "$milk of milk\n" +
            "$beans of coffee beans\n" +
            "$cups of disposable cups\n" +
            "$money of money")
}
