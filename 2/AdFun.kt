fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
    val map = list
        .filterNotNull()
        /*.filter {
            it.startsWith("J")
        }
        .map {
            it.length
        }
        .take(3) //前から3つ取り出す
        .forEach{
            println(it)
        }*/
    val lang = map.last()
    println(lang)
}