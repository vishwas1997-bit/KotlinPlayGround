package datastructure.array.leetcode

import kotlin.math.min

private fun main(){
    println(smallestNumber(intArrayOf(1,2,3,4,5)))
}

// nums = [1,2,3,4,5]
private fun smallestNumber(nums : IntArray) : Int{
    var smallest = Int.MAX_VALUE
    for(i in nums.indices){
        smallest = min(smallest,nums[i])
    }
    return smallest
}