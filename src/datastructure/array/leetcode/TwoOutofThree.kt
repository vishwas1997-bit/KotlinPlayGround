package datastructure.array.leetcode

import java.util.Hashtable
import java.util.function.Consumer

/**
Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 */

private fun main(){
    println(twoOutOfThree(intArrayOf(3,1), intArrayOf(2,3), intArrayOf(3)))
}

private fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
    val set1 = HashSet<Int>()
    val set2 = HashSet<Int>()
    val set3 = HashSet<Int>()
    val set = HashSet<Int>()

    nums1.forEach {
        set1.add(it)
        set.add(it)
    }

    nums2.forEach {
        set2.add(it)
        set.add(it)
    }

    nums3.forEach {
        set3.add(it)
        set.add(it)
    }

    val list = ArrayList<Int>()
    for (i in set){
        if ((set1.contains(i) && set2.contains(i)) || (set2.contains(i) && set3.contains(i)) || (set1.contains(i) && set3.contains(i))){
            list.add(i)
        }
    }

    nums1.distinct()
    return list
}