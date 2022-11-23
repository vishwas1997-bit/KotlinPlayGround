package datastructure.array.leetcode

// Unsolved Need some R&d (XOR operator)
fun main(){
    print(singleNumber(intArrayOf(2,2,1)))
}

/**
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2] [1,1,2,2,4]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

solution : with bitwise xor operator
[100,001,010,001,010]
 100
 001 ---> 101
          010 ---> 111
                   001 ---> 110
                            010 ---> 100
 */

private fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (i in nums) {
        result = result xor i
    }
    return result
}