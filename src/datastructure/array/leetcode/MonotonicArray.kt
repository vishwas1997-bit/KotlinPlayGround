package datastructure.array.leetcode

private fun main() {
    println(isMonotonic(intArrayOf(1,3,2)))
}

/**
 * Input: nums = [1,2,2,3]
 * Output: true
 */
private fun isMonotonic(nums: IntArray): Boolean {
    var inc = true
    var dec = true
    for(i in 1 until nums.size){
        inc = (inc && (nums[i -1] <= nums[i]))
        dec = (dec && (nums[i -1] >= nums[i]))
    }
    return inc || dec
}