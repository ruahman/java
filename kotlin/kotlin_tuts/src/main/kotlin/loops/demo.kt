package loops

fun demo(){
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    i = 0
    do {
        println(i)
        i++
    }
    while (i < 5)

    //// break
    i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    //// continue
    i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }

    //// loop through array
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    //// loop through map
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    for ((k, v) in theMap) {
        println("$k = $v")
    }

    val theMap2 = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    theMap2.forEach { (k, v) ->
        println("Key = $k, Value = $v")
    }



    //// ranges
    for (chars in 'a'..'x') {
        println(chars)
    }

    for (num in 5..15) {
        println(num)
    }

    for (num in 1.rangeTo(4) ) {
        println(num)
    }

    for ( num in 4 downTo 1 ) {
        println(num)
    }

    for ( num in 1..10 step 2 ) {
        println(num)
    }

    for ( num in (1..5).reversed() ) {
        println(num)
    }

    for ( num in 1 until 5 ) {
        println(num)
    }

    outerLoop@ for (i in 1..3) {
        innerLoop@ for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2){
                break@outerLoop
            }
        }
    }

    outerLoop@ for (i in 1..3) {
        innerLoop@ for (j in 1..3) {
            if (i == 2){
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
    }

    // A "for" loop can be used with anything that provides an iterator.
    for (c in "hello") {
        println(c)
    }

    // "while" loops work in the same way as other languages.
    var ctr = 0
    while (ctr < 5) {
        println(ctr)
        ctr++
    }
    do {
        println(ctr)
        ctr++
    } while (ctr < 10)



}