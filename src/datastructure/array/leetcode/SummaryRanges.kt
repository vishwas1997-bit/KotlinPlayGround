package datastructure.array.leetcode

/**
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: The ranges are:
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 */

private fun main(){
    println(summaryRanges(intArrayOf(0,1,2,4,5,7)))
}

// Brute Force Approach
private fun summaryRanges(nums: IntArray): List<String> {
    val list : MutableList<String> = ArrayList()
    var i  = 0
    while (i < nums.size) { // i = 2
        val start = nums[i] // 0
        while (i + 1 < nums.size && nums[i] + 1 == nums[i + 1]) i++
        if (start != nums[i]) {
            list.add("" + start + "->" + nums[i])
        } else {
            list.add("" + start)
        }
        i++
    }
    return list
}