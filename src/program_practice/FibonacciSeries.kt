package program_practice

fun main(){
    val obj = FibonacciSeries()
}

class FibonacciSeries {
    // Series Example -> 0,1,1,2,3,5,8,13........

    init {
        var firstValue = 0
        var secondValue = 1
        for (i in 0..8){
            println(firstValue)
            val sum = firstValue + secondValue
            firstValue = secondValue
            secondValue = sum
        }
    }
}