package datastructure.stack.leetcode

import java.util.*
import kotlin.collections.HashMap

private fun main(){
    val output = nextGreaterElement2(intArrayOf(2,4), intArrayOf(1,2,3,4))
    for (i in output){
        println(i)
    }
}

// Brute Force Approach
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Input: nums1 = [2,4], nums2 = [1,2,3,4]
// Output: [3,-1]
// time complexity = O(n^2)
private fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val ans = IntArray(nums1.size)
    for (i in nums1.indices){
        for (k in nums2.indices){
            if (nums1[i] == nums2[k]){
                if (k+1 == nums2.size){
                    ans[i] = -1
                    break
                }
                if (nums2[k+1] > nums1[i]){
                    ans[i] = nums2[k+1]
                    break
                } else{
                    ans[i] = -1
                    break
                }
            }
        }
    }
    return ans
}

// Input: nums1 = [2,4], nums2 = [1,2,3,4]
// Output: [3,-1]
private fun nextGreaterElement2(nums1: IntArray, nums2: IntArray): IntArray{
    val stack = Stack<Int>()
    val map = HashMap<Int,Int>()
    for (num in nums2){
        while (stack.isNotEmpty() && stack.peek() < num){
            map[stack.peek()] = num // {[1,2],[2,3],[3,4]}
            stack.pop()
        }
        stack.push(num) // [4]
    }
    for (i in nums1.indices){
        nums1[i] = map.getOrDefault(nums1[i],-1)
    }
    return nums1
}
