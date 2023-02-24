import java.util.*

class Foo {
    val bar: Int
        get() = Random().nextInt(100)
}

fun main() {
    val foo = Foo()
    println("foo.bar = ${foo.bar}")
    println("foo.bar = ${foo.bar}")
    println(KotlinVersion.CURRENT)
}