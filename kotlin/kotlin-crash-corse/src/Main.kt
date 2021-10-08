import java.lang.Exception
import java.util.*

fun main(){
    println("hello world2")
    var x:Int = 3
    println("x:$x")
    x = 4
    println("x:$x")
    val y = 5
    // not allowed
    //y = 6

    val string = "this is my kotlin crash course"
    println(string.uppercase(Locale.getDefault()))

    val zStr = if(y == 5) "five" else "something else"
    println(zStr)

    var xB:Int? = null
    xB = 222


//    val num1 = readLine() ?: "0"
//    val num2 = readLine() ?: "0"
//
//    val res = num1!!.toInt() + num2!!.toInt()
//    println(res)

    val shoppingList = listOf<String>("kotlin","java","scala","clojure","jruby","jython")
    println(shoppingList)

    val mutShoppingList = mutableListOf<String>("kotlin","java","scala","clojure","jruby","jython")
    mutShoppingList.add("erlang")
    mutShoppingList.add("ocaml")
    mutShoppingList.add("haskel")
    println(mutShoppingList)

    var counter = 0
    while(counter < mutShoppingList.size){
        println(mutShoppingList[counter])
        counter++
    }

    for(item in shoppingList){
        println(item)
    }

    for(i in 1..100){
        println(i)
    }

    val xv = 5
    when(xv){
        in 0..3 -> println("0..3")
        in 4..7 -> println("4..7")
        else -> println("the rest of numbers")
    }

    fun isEven(x:Int):Boolean {
        return x % 2 == 0
    }

    println(isEven(4))
    println(isEven(5))

    // you can extend any class
    fun Int.isOdd():Boolean {
        return !isEven(this)
    }

    val yv = 77
    println(yv.isOdd())

//    val anim = Animal("simple animal")
    val dog = Dog()
    dog.bark()

    val bear = object : Animal("Bear"){
        override fun makeSound(): String {
            return "ohh bother"
        }

        fun roar(){
            println(makeSound())
        }
    }

    bear.roar()

//    val input = readLine() ?: "0"
//    val parseInt = try {
//        input.toInt()
//    } catch(ex:Exception){
//        0
//    }

    val listCount = mutShoppingList.count { it.length > 6 }
    println(listCount)

}