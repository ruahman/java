import java.text.MessageFormat

// val never changes
val name = "Nate"
// var can change, but is none nullable
// String? can have a null
var greeting: String? = null

fun funGreeting(): String {
    return "Hello Greeting"
}

fun sayHello(): Unit {
    println(funGreeting())
}

fun simpleFun() = "simple function"

fun sayHello2() {
    println(funGreeting())
}

fun sayHello3(message:String) {
    val msg = "message: $message"
    println(msg)
}

fun sayHelloSimple(msg:String) = println("message: $msg")

fun sayHelloList(msg:String, list:List<String>) {
    list.forEach { item -> println("$msg: $item") }
}

fun sayHellVarArg(msg:String, vararg items:String) {
    items.forEach { item -> println("$msg - $item")}
}

fun main(){
    println("hello world")
    greeting = "Hello"
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    val newGreeting = if(greeting != null) greeting else "default"

    val newGreeting2 = when(greeting){
        null -> "Hi"
        else -> greeting
    }

    println(newGreeting + newGreeting2)

    println(funGreeting())

    sayHello()
    sayHello2()
    println(simpleFun())

    println(sayHello3("this is my message"))
    println(sayHello3(message="another message"))
    sayHelloSimple(msg="this is a simple message")

    var interestingThings = arrayOf("kotlin","clojure","scala","jython","jruby")
    println(interestingThings.size)

    for(interestingThing in interestingThings){
        println(interestingThing)
    }

    interestingThings.forEach { item -> println(item) }

    interestingThings.forEachIndexed { idx, value -> println("$idx,$value")}

    val map = mapOf(0 to "A", 1 to "B", 2 to "C")
    map.forEach { (k, v) -> println("$k:$v") }

    val mutList = mutableListOf("go","rust","ocaml","haskell")
    mutList.add("erlang")
    mutList.add("lisp")

    sayHelloList("hit",mutList)

    sayHellVarArg("test","DApp","wasm","ML")

    val test1 = arrayOf("vue","react","flutter")
    sayHellVarArg("spread",*test1)

//    val person = Person("Diego","Vila")
    val person = Person()
    person.nickName = "SpiderMan"

    println("${person.firstName} ${person.lastName} ${person.nickName}")

    person.printInfo()

    var infoP = BasicInfoProvider()
    infoP.printInfo(person)

    checkTypes(infoP)

    val fInfoP = object : FancyInfoProvider() {
        override val info: String
            get() = "object extender info"

        override fun printInfo(person: Person) {
            super.printInfo(person)
        }
    }

    fInfoP.printInfo(person)

    //val entity = Entity.Factory.create()

    EntityFactory.foobar()
    EntityFactory.showType(EntityType.EASY)
    EntityFactory.showType(EntityType.MEDIUM)

    val e1 = EntityFactory.create(EntityType.EASY)

    val msg = when(e1){
        is Entity.Easy -> "Entity Easy"
        is Entity.Medium -> "Entity Medium"
        is Entity.Hard -> "Entity Hard"
        Entity.Helper -> "this is helper"
    }

    println(msg)

    val e2 = EntityFactory.create(EntityType.EASY)

    if(e1 == e2){
        println("they are the same")
    }
    if(e1 !== e2){
        println("not exactly the same")
    }

    (e1 as Entity.Easy).thisIsEasy()

    if(e1 is Entity.Easy){
        // smart cast
        e1.thisIsEasy()
    }

    fun highOrderFun(list:List<String>,callback:(String)->Boolean){
        list.forEach { item ->
            if(callback(item)){
                println(item)
            }
        }
    }

    val myList = listOf("Kotlin","clojure","scala")
    highOrderFun(myList) { it.startsWith('K') }

    val list2 = listOf("kotlin","clojure","scala",null,"java","jython",null,"jRuby")

    list2
        .filterNotNull()
        .filter { it.startsWith('j') }
        .map { it to it.length }
        //.associate { it to it.length }
        .take(2)
        .forEach { println(it) }

    val res = list2.find { it == "kotlin" }
    println(res)

}