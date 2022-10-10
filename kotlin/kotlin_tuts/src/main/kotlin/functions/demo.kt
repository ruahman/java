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

fun sumTwo(a:Int, b:Int):Unit{
    val x = a + b

    println( x )
}

fun sum(a: Int, b: Int) = a + b

fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}

fun square(x: Int) = x * x

// return a function
fun operation(): (Int) -> Int {
    return ::square
}

inline fun myFunction6(function:()-> Unit){
    println("I am inline function - A")

    function()

    println("I am inline function - B")
}

fun demo(){
    myFunction()
    myFunction2("John")
    myFunction3("diego",41)
    myFunction4(5)
    myFunction5(2,3)
    sumTwo(2,2)

    // Here :: is the notation that references a function by name in Kotlin.
    val result = calculate(4, 5, ::sum)
    println( result )

    //// Lambda function
    val upperCase = { str: String -> str.toUpperCase() }

    println( upperCase("hello, world!") )

    myFunction6 { println("this is an inline function") }

    /*
    Functions can be declared using the "fun" keyword.
    Function arguments are specified in brackets after the function name.
    Function arguments can optionally have a default value.
    The function return type, if required, is specified after the arguments.
    */
    fun hello(name: String = "world"): String {
        return "Hello, $name!"
    }
    println(hello("foo")) // => Hello, foo!
    println(hello(name = "bar")) // => Hello, bar!
    println(hello()) // => Hello, world!

    /*
    A function parameter may be marked with the "vararg" keyword
    to allow a variable number of arguments to be passed to the function.
    */
    fun varargExample(vararg names: Int) {
        println("Argument has ${names.size} elements")
    }
    varargExample() // => Argument has 0 elements
    varargExample(1) // => Argument has 1 elements
    varargExample(1, 2, 3) // => Argument has 3 elements

    /*
    When a function consists of a single expression then the curly brackets can
    be omitted. The body is specified after the = symbol.
    */
    fun odd(x: Int): Boolean = x % 2 == 1
    println(odd(6)) // => false
    println(odd(7)) // => true

    // If the return type can be inferred then we don't need to specify it.
    fun even(x: Int) = x % 2 == 0
    println(even(6)) // => true
    println(even(7)) // => false

    // Functions can take functions as arguments and return functions.
    fun not(f: (Int) -> Boolean): (Int) -> Boolean {
        return {n -> !f.invoke(n)}
    }
    // Named functions can be specified as arguments using the :: operator.
    val notOdd = not(::odd)
    val notEven = not(::even)
    // Lambda expressions can be specified as arguments.
    val notZero = not {n -> n == 0}

    /*
   If a lambda has only one parameter
   then its declaration can be omitted (along with the ->).
   The name of the single parameter will be "it".
   */
    val notPositive = not {it > 0}
    for (i in 0..4) {
        println("${notOdd(i)} ${notEven(i)} ${notZero(i)} ${notPositive(i)}")
    }
}