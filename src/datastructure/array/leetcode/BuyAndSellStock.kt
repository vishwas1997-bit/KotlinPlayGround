package datastructure.array.leetcode

import kotlin.math.max

private fun main(){
    println("MaxProfit : "+ maxProfitTest(intArrayOf(7,1,5,3,6,4)))
}

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Input: prices = [7,6,4,3,1]
//Output: 0
private fun maxProfit(prices: IntArray): Int {
    var maxCur = 0
    var maxSoFar = 0
    for (i in 1 until prices.size) {
        maxCur = max(0, maxCur + prices[i] - prices[i - 1])
        maxSoFar = max(maxCur, maxSoFar)

    }
    return maxSoFar
}

private fun maxProfitTest(prices: IntArray): Int{
    var min = prices[0]
    var max = 0
    for (i in 1 until prices.size){
        min = Math.min(min, prices[i])
        max = Math.max(max, prices[i] - min)
    }
    return max
}