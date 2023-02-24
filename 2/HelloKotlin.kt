val name = "Taro"
var greeting: String? = null // ❔はnull許容型

fun main() {
    greeting = "Hello"
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}