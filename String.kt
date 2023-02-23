fun main() {
    val c1: Char = 'A'
    val c2: Char = '\u3042'
    println("$c1 $c2")

    val s = """
        Hi
        How are you?
    """.trimIndent()
    println(s)

    var n: String = "Nick"
    println("Hi ${n}!")
    n = "Taro"
    println("Gm ${n}!")
}