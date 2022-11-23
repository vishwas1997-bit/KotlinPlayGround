package datastructure.array.leetcode

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet


/**
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */
private fun main() {
    println(threeSumII(intArrayOf(-1, 0, 1, 2, -1, -4)))
}

private fun threeSum(nums: IntArray): List<List<Int>> {
    val set = HashSet<List<Int>>()
    val list = ArrayList<List<Int>>()
    for (i in nums.indices) {
        if (i + 1 < nums.size) {
            for (j in i + 1 until nums.size) {
                if (j + 1 < nums.size) {
                    for (k in j + 1 until nums.size) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            set.add(listOf(nums[i], nums[j], nums[k]))
                        }
                    }
                }
            }
        }
    }
    return ArrayList(set)
}

private fun threeSumII(nums: IntArray): List<List<Int>> {
    val res: MutableSet<List<Int>> = HashSet()
    if (nums.isEmpty()) return ArrayList(res)
    Arrays.sort(nums)
    for (i in nums.indices - 2) {
        var j = i + 1
        var k = nums.size - 1
        while (j < k) {
            val sum = nums[i] + nums[j] + nums[k]
            if (sum == 0) {
                res.add(
                    listOf(
                        nums[i],
                        nums[j++],
                        nums[k--]
                    )
                )
            } else if (sum > 0) {
                k--
            } else if (sum < 0) {
                j++
            }
        }
    }
    return ArrayList(res)
}