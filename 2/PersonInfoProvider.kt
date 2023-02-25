interface PersonInfoProvider { //継承されるためのテンプレ abstract class(スーパークラスという概念)との違い-> abstractは継承、intarfaceは規格。
    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    } 
}

interface SessionInfoProvider { 
    fun getSessionId() : String
}

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider { //テンプレを使い、上書き
    override val providerInfo: String
        get() = "BasicInfoProvider"

    open val sessionIdPrefix = "Session"
    
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    } 

    override fun getSessionId() : String {
        return sessionIdPrefix
    }
}

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

class FancyInfoProvider : BasicInfoProvider() {
    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Info Provider"
    
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}

fun main() {
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"
        
        fun getSessionId() = "id"
    }


    provider.printInfo(Person())
    provider.getSessionId()
}

fun checkTypes(infoProvider: PersonInfoProvider) { //PersonInfoProvider型の引数infoProvider
    if (infoProvider is SessionInfoProvider) {
        println("is a session provider")
        infoProvider.getSessionId()
    } else {
        println("not a session provider")
    }
}