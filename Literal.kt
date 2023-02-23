fun main() {
    val b = 0b1001
    println(b)

    val a1 = 0xDEADBEEF
    val a2 = 0xDEAD_BEEF
    println("a1 = $a1")
    println("a2 = $a2")

    println("a1 = %08X".format(a1))
    println("a2 = %08X".format(a2))
}