fun greetHello(greeting: String, vararg itemToGreet: String) { //vararg -> 可変長変数 ??? -> 何個でも引数入れられるやつ？
    itemToGreet.forEach { item -> 
    println("$greeting $item")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "kiki") = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Prog", "Books")
    //greetHello("Hi", "Kotlin", "Prog", "Books")
    greetHello("Hi", *interestingThings) // *をつけて配列展開

    greetPerson()
    greetPerson(greeting = "Hi", name = "Taro")//上書きされる
}