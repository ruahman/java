abstract class Animal(
    val name:String,
    val legs:Int = 4
) {

    init {
        println("name of animal: $name")
        println("number of legs: $legs")
    }

    abstract fun makeSound():String
}

class Dog : Animal(name="Dog"){
    init {
        println("this is a dog")
    }

    override fun makeSound():String {
        return "bark bark bark...."
    }

    fun bark(){
        println(makeSound())
    }
}