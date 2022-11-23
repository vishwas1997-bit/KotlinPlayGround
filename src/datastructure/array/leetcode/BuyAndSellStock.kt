package datastructure.array.leetcode

import kotlin.math.max

fun main(){
    println("MaxProfit : "+maxProfit(intArrayOf(7,1,5,3,6,4)))
}

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Input: prices = [7,6,4,3,1]
//Output: 0
fun maxProfit(prices: IntArray): Int {
    var maxCur = 0
    var maxSoFar = 0
    for (i in 1 until prices.size) {
        maxCur = max(0, maxCur + prices[i] - prices[i - 1])
        maxSoFar = max(maxCur, maxSoFar)

    }
    return maxSoFar


//    var minValue = Integer.MAX_VALUE
//    var maxValue = Integer.MIN_VALUE
//    var index : Int = -1
//    for (i in prices.indices){
//        if (prices[i] < minValue){
//            minValue = prices[i]
//            index = i
//        }
//    }
//
//    for (i in index until prices.size){
//        if (maxValue < prices[i]){
//            maxValue = prices[i]
//        }
//    }
//
//    return maxValue - minValue
}