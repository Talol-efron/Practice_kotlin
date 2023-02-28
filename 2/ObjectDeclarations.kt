import java.util.*

enum class EntityType { //列挙型
    HELP, EASY, MEDIUM, HARD;

    fun getFormatedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    //fun create() = Entity("123", "taro")
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY   -> type.name
            EntityType.MEDIUM -> type.getFormatedName()
            EntityType.HARD   -> "Hard"
            EntityType.HELP   -> type.getFormatedName()
        }
        return when (type) {
            EntityType.EASY   -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD   -> Entity.Hard(id, name, multiplier:2f)
            EntityType.HELP   -> Entity.Help
        }
    }
}

sealed class Entity() { //enumの拡張版的な。外からの継承を制限する
    /*override fun toString(): String {
        return "id:$id  name:$name"
    }*/
    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity() //data class 引数入れるだけで自動生成
    data class Medium(val id: String, val name: String): Entity() 
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main() {
    val entity: Entity = EntityFactory.create(EntityType.EASY)
    val msg = when(entity) {
        Entity.Help      -> "help class"
        is Entity.Easy   -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard   -> "hard class"
    }

    println(msg)
}