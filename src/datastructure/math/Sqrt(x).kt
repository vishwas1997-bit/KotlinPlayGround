package datastructure.math

import kotlin.math.sqrt

private fun main(){
    println(mySqrt(8))
}

private fun mySqrt(x: Int): Int {
    return sqrt(x.toDouble()).toInt()
}