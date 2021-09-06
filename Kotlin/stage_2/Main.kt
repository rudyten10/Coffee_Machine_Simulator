fun main() {
    print("Write gow many cups of coffee you will need: ")
    val cups = readLine()!!.toInt()
    println()
    println("For $cups of coffee you will need:")
    println("""
        ${cups * 200} ml of water
        ${cups * 50} ml of milk
        ${cups * 15} g of coffee beans
    """.trimIndent())
}
