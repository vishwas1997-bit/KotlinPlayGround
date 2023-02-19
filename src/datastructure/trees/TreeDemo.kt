package datastructure.trees

import java.util.*
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
    val output = inorderTraversal(root)
    for (data in output){
        print(data)
    }
}

private fun inorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = ArrayList()

    val stack = Stack<TreeNode>()
    var cur: TreeNode? = root

    while (cur != null || !stack.empty()) {
        while (cur != null) {
            stack.add(cur)
            cur = cur.left
        }
        cur = stack.pop()
        list.add(cur.`val`)
        cur = cur.right
    }

    return list
}