package arrays

fun demo(){

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    cars[0] = "Opel"

    println(cars.size)

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    //// filter ranges
    val a = 1..10
    val f = a.filter { T -> T % 2 == 0 }

    println(f)

}