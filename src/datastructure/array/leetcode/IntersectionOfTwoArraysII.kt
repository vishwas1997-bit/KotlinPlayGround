package datastructure.array.leetcode

import java.util.Arrays

/**
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
private fun main() {
    val output = intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    output.forEach { print(it) }
}

//Time Complexity: O(nlog(n))
private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    nums2.sort()
    val output = arrayListOf<Int>()
    var i = 0
    var j = 0
    while (i < nums1.size && j < nums2.size){
        if (nums1[i] == nums2[j]){
            output.add(nums1[i])
            i++
            j++
        } else if (nums1[i] < nums2[j]){
            i++
        } else {
            j++
        }
    }
    return output.toIntArray()
}