package datastructure.array.leetcode

/**
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
private fun main(){
    println(maxSubArray(intArrayOf(5,4,-1,7,8)))
}

private fun maxSubArray(nums: IntArray): Int {
    var maxSoFar = nums[0]
    var maxEnding =  nums[0]
    for (i in 1 until nums.size){
        maxEnding = Math.max(maxEnding + nums[i], nums[i])
        maxSoFar = Math.max(maxSoFar, maxEnding)
    }
    return maxSoFar
}