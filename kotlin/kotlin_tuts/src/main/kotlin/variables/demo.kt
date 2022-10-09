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
}