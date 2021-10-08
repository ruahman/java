class Person(val firstName:String = "Peter", val lastName:String = "Parker") {
    var nickName:String? = null
        get() {
            println("get $field")
            return field
        }
        set(value){
            field = value
            println("set $value")
        }

    fun printInfo(){
        val nick = nickName ?: "n/a"
        println("info: $firstName $lastName $nick")
    }
}

//class Entity private constructor(val id:String){
//
//    // static functions
//    companion object Factory {
//        fun create() = Entity("id")
//    }
//}

sealed class Entity {
    object Helper: Entity() {
        val name = "Helper"
    }
    data class Easy(val id:String, val name:String ): Entity()
    data class Medium(val id:String, val name:String): Entity()
    data class Hard(val id:String, val name:String, val data:Int): Entity()
}

fun Entity.Easy.thisIsEasy(){
    println("this is easy")
}

object EntityFactory {
    fun foobar() = println("foobar")
    fun showType(type: EntityType){
        when(type) {
            EntityType.EASY -> println(type.name)
            EntityType.MEDIUM -> println(type.format())
            EntityType.HARD -> println("hard")
        }
    }
    fun create(type: EntityType): Entity {
        return when(type){
            EntityType.EASY -> Entity.Easy("e","easy")
            EntityType.MEDIUM -> Entity.Medium("m","medium")
            EntityType.HARD -> Entity.Hard("m","medium", 23)
        }
    }

}

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun format():String = name.toLowerCase().capitalize()
}

//class Person(val firstName:String, val lastName:String){
//
//    init {
//        println("init1")
//    }
//
//    constructor():this("peter","parker") {
//        println("second constructor")
//    }
//
//    init {
//        println("init2")
//    }
//}

//class Person(_firstName:String, _lastName:String) {
//    val firstName:String = _firstName
//    val lastName:String = _lastName
//
////    init {
////        firstName = _firstName
////        lastName = _lastName
////    }
//}