package datastructure.array.leetcode

import java.util.function.Consumer

/**
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 */
private fun main(){
    val output = addToArrayForm(intArrayOf(2,1,5), 806)
    output.forEach(
        Consumer { print(it) }
    )
}

private fun addToArrayForm(num: IntArray, k: Int): List<Int> {
    val list = ArrayList<Int>()
    var sum = k
    var l = num.size - 1
    while(l >= 0 || sum != 0){
        if (l >= 0){
            sum += num[l--]
        }
        list.add(sum % 10)
        sum /= 10
    }
    list.reverse()
    return list
}