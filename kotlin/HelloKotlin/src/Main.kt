fun main(){
    val name:String = "my-name"
//    name = "diego"
    var name2 = "test"
    name2 = "diego"

    // variables by default are none null
    var name3: String? = null
    name3 = "this can allow nulls"
    println("hello world. again??")
    println(name)
    println(name2)

    if (name3 != null) {
        println(name3)
    }
    else {
        println("nothing for name3")
    }

    when(name3){
        null -> println("hi")
        else -> println(name3)
    }

}