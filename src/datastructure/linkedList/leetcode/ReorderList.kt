package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode
import java.util.*

private fun main() {
    val node_1 = ListNode(1)
    val node_2 = ListNode(2)
    val node_3 = ListNode(3)
    val node_4 = ListNode(4)
    val node_5 = ListNode(5)
    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    node_4.next = node_5
    val output = reorderList(node_1)
    ListNode.printList(output)
}

private fun reorderList(head: ListNode?): ListNode {
    val stack = Stack<ListNode>()
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    fast = slow
    while (fast != null && fast.next != null) {
        stack.push(fast.next)
        fast = fast.next
    }

    slow?.next = null
    var mHead = head
    var dummyHead = ListNode(-1)
    while (mHead != null) {
        val temp = mHead?.next
        dummyHead.next = mHead
        dummyHead = mHead!!
        if (!stack.isEmpty()) {
            val node = stack.pop()
            dummyHead.next = node
            dummyHead = node
        }
        mHead = temp
    }
    return head!!
}