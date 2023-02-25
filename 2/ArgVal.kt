fun greetHello(greeting: String, vararg itemToGreet: String) { //vararg -> 可変長変数 ??? -> 何個でも引数入れられるやつ？
    itemToGreet.forEach { item -> 
    println("$greeting $item")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "kiki") = println("$greeting $name")

public class Person(val firstName: String = "Peter", val lastName: String = "Perker"){
    var nickName: String? = null
        set(value) { //nickName プロパティの値を書き換えようとすると、set()が呼び出される
            field = value
            println("the new nickname is $value")
        }
        get() { //nickName プロパティを参照した際に呼びだされる
            println("the returned value is $field")
            return field
        }

        fun printInfo() {
            val nickName = nickName ?: "no nickName"
            println("$firstName ($nickName) $lastName")
        } 
}

fun main() {

    

    /*val interestingThings = arrayOf("Kotlin", "Prog", "Books")
    //greetHello("Hi", "Kotlin", "Prog", "Books")
    greetHello("Hi", *interestingThings) // *をつけて配列展開

    greetPerson()
    greetPerson(greeting = "Hi", name = "Taro")//上書きされる

    val person = Person()
    person.printInfo()*/
}