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