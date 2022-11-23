package datastructure.array.leetcode

private fun main() {
    println(searchLinearly(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
}

/**
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4

 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 */
private fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r: Int = nums.size - 1
    while (l <= r) {
        val m = l + (r - l) / 2
        if (nums[m] == target) return m
        if (nums[m] < target) l = m + 1 else r = m - 1
    }
    return -1
}

private fun searchLinearly(nums: IntArray, target: Int): Int {
    var index = -1
    for (i in nums.indices){
        if (nums[i] == target){
            index = i
        }
    }
    return index
}

