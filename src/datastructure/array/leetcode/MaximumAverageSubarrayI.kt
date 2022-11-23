package datastructure.array.leetcode

import kotlin.math.max
import kotlin.math.min

private fun main() {
    println(minimumDifference(intArrayOf(9,4,1,7), 3))
}

/**
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var maxAvg = Double.MIN_VALUE
    for (i in 0 until k){
        maxAvg += nums[i]
    }

    var window = maxAvg // 2
    for (j in k until nums.size){
        window += nums[j] - nums[j - k]
        maxAvg = max(window, maxAvg)
    }
    return maxAvg / k
}

/*
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
*/

private fun minimumDifference(nums: IntArray, k: Int): Int {
    nums.sort() //[1,4,7,9]
    var minimumDiff = Int.MAX_VALUE
    var i = 0
    while (i + k -1 < nums.size){
        minimumDiff = min(minimumDiff, nums[i+k-1] - nums[i])
        i++
    }
    return minimumDiff
}
