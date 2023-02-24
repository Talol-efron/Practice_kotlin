fun greetHello(greeting: String, itemToGreet: Array<String>) {
    itemToGreet.forEach { item -> 
    println("$greeting $item")
    }
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programing", "Books") //arrayOf() -> 可変, listOf() -> 不可変
    //println(interestingThings.size)
    println(interestingThings[0]) // == println(interestingThings.get(0))

    /*for (thing in interestingThings) {
        println(thing)
    } */

    /*interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }*/

    /*interestingThings.forEach { //省略版。要素はitに格納される
        println(it)
    }*/

    interestingThings.forEachIndexed {index, interestingThing -> //順番とarrayの内容が出力される
        println("$interestingThing is at index $index")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c") //辞書型
    map.forEach { key, value ->
        println("$key -> $value")
    }

    greetHello("Hi", interestingThings)
}


