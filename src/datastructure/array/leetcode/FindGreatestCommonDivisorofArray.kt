package datastructure.array.leetcode

import kotlin.math.max

/**
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
 */
private fun main(){
    println(findGCD(intArrayOf(2,5,6,9,10)))
}

private fun findGCD(nums: IntArray): Int {
    var min = 1001
    var max = 0
    nums.forEach {
        max = Math.max(max,it)
        min =  Math.min(min, it)
    }

    while (min > 0){
        val temp = min
        min = max % min
        max = temp
    }
    return max
}