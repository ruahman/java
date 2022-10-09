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

    //// ranges
    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 5..15) {
        println(nums)
    }
}