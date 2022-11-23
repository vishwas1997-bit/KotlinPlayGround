package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

/**
 * [1,2,3,4,1]
 * */
fun main(){
    val list1 = ListNode(1)
    val list2 = ListNode(2)
    val list3 = ListNode(3)
    val list4 = ListNode(1)

    list1.next = list2
    list2.next = list3
    list3.next = list4

    ListNode.printList(removeElements(list1, 7))
}

private fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    if (head == null) return null // 1
    val next = removeElements(head.next, `val`) // 1
    if (head.`val` == `val`){
        return next
    }
    head.next = next
    return head
}