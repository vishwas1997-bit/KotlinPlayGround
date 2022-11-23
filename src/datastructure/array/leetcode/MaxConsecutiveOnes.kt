package datastructure.array.leetcode

import kotlin.math.max

private fun main(){
    println(findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
}

private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxCur = 0
//    var maxSoFar = 0
    for(i in nums){
        if (i == 1){
            maxCur += i
//            maxSoFar = Math.max(maxCur,maxSoFar)
        } else{
            maxCur = 0
        }
    }
    return maxCur
}