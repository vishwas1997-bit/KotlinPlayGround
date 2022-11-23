package BasicConcept

fun main() {

    // for known steps
    for (i in 1..10){
        print("$i\t")
        if (i == 10){
            println()
        }
    }

    // use of range
    for (i in 6 downTo 0 step 2) {
        print("$i\t")
        if (i == 0){
            println()
        }
    }

    //use of until
    for (i in 1 until 10) {       // i in 1 until 10, excluding 10
        println("Until Loop")
        print("$i\t")
        if (i == 9){
            println()
        }
    }

    // foreach loop
    val names = intArrayOf(1,2,3)
    for (name in names) {
        println(name)
    }

    val array = intArrayOf(1,2,3,4,5,6)
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }


}

