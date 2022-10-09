package functions

fun myFunction() {
    println("I just got executed!")
}
fun myFunction2(fname: String) {
    println(fname + " Doe")
}

fun myFunction3(fname: String, age: Int) {
    println(fname + " is " + age)
}

fun myFunction4(x: Int): Int {
    return (x + 5)
}

fun myFunction5(x: Int, y: Int) = x + y

fun demo(){
    myFunction()
    myFunction2("John")
    myFunction3("diego",41)
    myFunction4(5)
    myFunction5(2,3)
}