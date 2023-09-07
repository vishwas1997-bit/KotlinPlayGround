package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

private fun main(){
    val node_1 = ListNode(1)
    val node_2 = ListNode(2)
    val node_3 = ListNode(3)
    node_1.next = node_2
    node_2.next = node_3
    val newHead = removeNthFromEnd(node_1, 1)
    ListNode.printList(newHead)
}

private fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    
    return null
}