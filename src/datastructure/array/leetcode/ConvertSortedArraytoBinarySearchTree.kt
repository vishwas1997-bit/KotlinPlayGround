package datastructure.array.leetcode

import datastructure.trees.TreeNode

private fun main(){
    val node = sortedArrayToBST(intArrayOf(-10,-3,0,5,9))
    println(node)
}

private fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return createBST(nums, 0, nums.size - 1)
}

private fun createBST(nums: IntArray, l: Int, r: Int): TreeNode? {
    if (l > r) { // Base Condition or Recursion Stoping Condition
        return null
    }
    // so basically in this question we have to convert sorted array to height balanced tree
    // so if we directly create tree in given sorted order it will become linked list
    // so we have to take middle element as head value such it will  become height balanced tree
    val mid = l + (r - l) / 2
    val root = TreeNode(nums[mid]) // mid value or median
    root.left = createBST(nums, l, mid - 1) // assign the value for left of subtree that is l to mid -1 for given array
    root.right = createBST(nums, mid + 1, r) // assign the value for right go subtree that is mid+1 to r for given array
    return root
}