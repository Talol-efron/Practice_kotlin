interface IdProvider {
    fun getId(): String
}

class Entity(val id: String) {

    companion object Factory : IdProvider { //companion object -> classに対して一意の値を持つ。最後に代入した値にずべてなる
        override fun getId(): String {
            return "123"
        }

        const val id = "id" //constと同様書き換え不可能

        fun create() = Entity(getId())
    }
}

fun main() {
    val entity = Entity.create()
    println(entity)
}