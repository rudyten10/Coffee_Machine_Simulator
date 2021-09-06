import java.lang.Integer.min

const val NEED_WATER = 200
const val NEED_MILK = 50
const val NEED_BEANS = 15
const val HOW_MANY = "Write how many"
const val HAS = "the coffee machine has:"

fun main() {

    print("$HOW_MANY ml of water $HAS ")
    val hasWater = readLine()!!.toInt()
    print("$HOW_MANY ml of milk $HAS ")
    val hasMilk = readLine()!!.toInt()
    print("$HOW_MANY grams of coffee beans $HAS ")
    val hasBeans = readLine()!!.toInt()
    print("$HOW_MANY cups of coffee you will need: ")
    val needCups = readLine()!!.toInt()

    println(check(hasWater, hasMilk, hasBeans, needCups))
}

fun check(water: Int, milk: Int, beans: Int, cups: Int): String {

    val maxCups = min(water / NEED_WATER, min(milk / NEED_MILK, beans / NEED_BEANS))

    return if (maxCups < cups) "No, I can make only $maxCups cups of coffee"
    else if (maxCups == cups) "Yes, I can make that amount of coffee"
    else "Yes, I make that amount of coffee (and even ${maxCups - cups} more than that"
}
