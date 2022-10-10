package variables

fun demo(){

    //// var and val
    var name = "Diego"  // can be modified
    val year = 1981  // can't be modified

    var name2: String = "Andy"
    val year2: Int = 1984

    println("var can be modified: $name, $name2")
    println("val is constant: $year, $year2")

    /// types
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    /// type conversion
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    //// strings
    /*
    A raw string is delimited by a triple quote """.
    Raw strings can contain newlines and any other characters.
    */
    val fooRawString = """
fun helloWorld(val name : String) {
   println("Hello, world!")
}
"""

    //// Kotlin String Templates
    val name3 : String = "Zara Ali"

    println("Name  - $name3")  // Using template with variable name

    println("Name length - ${name3.length}")  // Using template with expression.


    //// nullable
    /*
    For a variable to hold null it must be explicitly specified as nullable.
    A variable can be specified as nullable by appending a ? to its type.
    We can access a nullable variable by using the ?. operator.
    We can use the ?: operator to specify an alternative value to use
    if a variable is null.
    */
    var fooNullable: String? = "abc"
    println(fooNullable?.length) // => 3
    println(fooNullable?.length ?: -1) // => 3
    fooNullable = null
    println(fooNullable?.length) // => null
    println(fooNullable?.length ?: -1) // => -1
}