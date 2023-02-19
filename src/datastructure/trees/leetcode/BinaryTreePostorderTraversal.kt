package datastructure.trees.leetcode

import datastructure.trees.TreeNode

private fun main(){
    val root = TreeNode(1)
    val node2 = TreeNode(2)
    val node3 = TreeNode(3)
    val node4 = TreeNode(4)
    val node5 = TreeNode(5)
    val node6 = TreeNode(6)
    val node7 = TreeNode(7)
    root.left = node2
    root.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
//    val output = postorderTraversal(root)
//    for (data in output){
//        print(data)
//    }
}

//private fun postorderTraversal(root: TreeNode?): List<Int> {
//
//}