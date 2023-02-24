
fun getGreeting(): String { //戻り値をStringに設定
    return "Hello Kotlin"
}

fun sayHello(): Unit { //voidと同じ。戻り値のない関数
    println(getGreeting())
}

fun callHello(itemToGreet: String) {
    //val msg = "Hello "  + itemToGreet
    val msg = "Hello $itemToGreet"
    println(msg)
}

fun greetHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    sayHello()
    callHello("World")
    greetHello("Hey", "Kotlin")
}