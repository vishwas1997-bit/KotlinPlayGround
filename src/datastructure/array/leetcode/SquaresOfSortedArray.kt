package datastructure.array.leetcode

private fun main(){
    val output = sortedSquares(intArrayOf(-4,-1,0,3,10))
    for (i in output){
        print(i)
    }
}

/**
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
private fun sortedSquares(nums: IntArray): IntArray {
    for (i in nums.indices){
        nums[i] = nums[i] * nums[i]
    }
    nums.sort()
    return nums
}