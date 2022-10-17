package collections


//// generics
interface Compare<T>{
    fun compare(item: T, item2: T): Int
}

fun demo(){
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)

    val numbersMut = mutableListOf("one", "two", "three", "four")

    numbersMut.add("five")

    println(numbersMut)

    val theSet = setOf("one", "two", "three", "four")
    println(theSet)

    val theMutableSet = mutableSetOf("one", "two", "three", "four")
    println(theMutableSet)

    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap)

    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)

    val theMap2 = HashMap<String, Int>()

    theMap2["one"] = 1
    theMap2["two"] = 2
    theMap2["three"] = 3
    theMap2["four"] = 4

    println(theMap2)

    val mapData = mapOf("a" to 1, "b" to 2)
    // Map.Entry is destructurable as well
    for ((key, value) in mapData) {
        println("$key -> $value")
    }

    /*
    We can create a list using the "listOf" function.
    The list will be immutable - elements cannot be added or removed.
    */
    val fooList = listOf("a", "b", "c")
    println(fooList.size) // => 3
    println(fooList.first()) // => a
    println(fooList.last()) // => c
    // Elements of a list can be accessed by their index.
    println(fooList[1]) // => b

    // A mutable list can be created using the "mutableListOf" function.
    val fooMutableList = mutableListOf("a", "b", "c")
    fooMutableList.add("d")
    println(fooMutableList.last()) // => d
    println(fooMutableList.size) // => 4

    // We can create a set using the "setOf" function.
    val fooSet = setOf("a", "b", "c")
    println(fooSet.contains("a")) // => true
    println(fooSet.contains("z")) // => false

    // We can create a map using the "mapOf" function.
    val fooMap = mapOf("a" to 8, "b" to 7, "c" to 9)
    // Map values can be accessed by their key.
    println(fooMap["a"]) // => 8

    /*
    Sequences represent lazily-evaluated collections.
    We can create a sequence using the "generateSequence" function.
    */
    val fooSequence = generateSequence(1) { it + 1 }
    val x = fooSequence.take(10).toList()
    println(x) // => [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    // An example of using a sequence to generate Fibonacci numbers:
    fun fibonacciSequence(): Sequence<Long> {
        var a = 0L
        var b = 1L

        fun next(): Long {
            val result = a + b
            a = b
            b = result
            return a
        }

        return generateSequence(::next)
    }
    val y = fibonacciSequence().take(10).toList()
    println(y) // => [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]


    // Kotlin provides higher-order functions for working with collections.
    val z = (1..9).map {it * 3}
        .filter {it < 20}
        .groupBy {it % 2 == 0}
        .mapKeys {if (it.key) "even" else "odd"}
    println(z) // => {odd=[3, 9, 15], even=[6, 12, 18]}



}