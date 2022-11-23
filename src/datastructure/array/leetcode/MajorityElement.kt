package datastructure.array.leetcode

import java.util.Arrays

/**
Input: nums = [3,2,3]
Output: 3

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

private fun main(){
    println(majorityElement1(intArrayOf(2,2,1,1,1,2,2)))
}

private fun majorityElement(nums: IntArray): Int {
    val hashMap = HashMap<Int,Int>()
    var repeatValue = 1
    for (i in nums){
        if (hashMap.containsKey(i)){
            hashMap[i] = hashMap.getValue(i) + 1
            if (hashMap.getValue(i) > nums.size/2){
                repeatValue = i
            }
        } else{
            hashMap[i] = 1
        }
   }

    return repeatValue
}

private fun majorityElement1(nums: IntArray): Int {
    Arrays.sort(nums)
    return nums[nums.size/2]
}