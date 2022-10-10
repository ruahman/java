package conditions

fun demo(){
    val time = 22

    //// if else
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    //// if else expressions
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    val greeting2 = if (time < 18) "Good day." else "Good evening."
    println(greeting2)


    //// when
    val day = 4

    val resultx = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(resultx)

    // "when" can be used as an alternative to "if-else if" chains.
    val x = 10
    when {
        x < 7 -> println("first block")
        x < 12 -> println("second block")
        else -> println("else block")
    }

    // "when" can be used with an argument.
    when (x) {
        0, 21 -> println("0 or 21")
        in 1..20 -> println("in the range 1 to 20")
        else -> println("none of the above")
    }

    // "when" can be used as a function that returns a value.
    var result = when (x) {
        0, 21 -> "0 or 21"
        in 1..20 -> "in the range 1 to 20"
        else -> "none of the above"
    }
    println(result)

    /*
    We can check if an object is of a particular type by using the "is" operator.
    If an object passes a type check then it can be used as that type without
    explicitly casting it.
    */
    fun smartCastExample(x: Any) : Boolean {
        if (x is Boolean) {
            // x is automatically cast to Boolean
            return x
        } else if (x is Int) {
            // x is automatically cast to Int
            return x > 0
        } else if (x is String) {
            // x is automatically cast to String
            return x.isNotEmpty()
        } else {
            return false
        }
    }
    println(smartCastExample("Hello, world!")) // => true
    println(smartCastExample("")) // => false
    println(smartCastExample(5)) // => true
    println(smartCastExample(0)) // => false
    println(smartCastExample(true)) // => true

    // Smartcast also works with when block
    fun smartCastWhenExample(x: Any) = when (x) {
        is Boolean -> x
        is Int -> x > 0
        is String -> x.isNotEmpty()
        else -> false
    }


}