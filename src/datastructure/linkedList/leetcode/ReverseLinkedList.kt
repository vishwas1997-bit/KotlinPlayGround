package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode


/**
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Input: head = [1,2]
Output: [2,1]
 */
private fun main(){
    val list1 = ListNode(1)
    val list2 = ListNode(2)
    val list3 = ListNode(3)
    val list4 = ListNode(4)
    val list5 = ListNode(5)
    list1.next = list2
    list2.next = list3
    list3.next = list4
    list4.next = list5
    list5.next = null
    val list = reverseList(list1)
    ListNode.printList(list)
}

private fun reverseList(head: ListNode?): ListNode? {
    var newHead :ListNode? = null
    var currentHead = head
    while (currentHead != null){
        val nextHead = currentHead.next
        currentHead.next = newHead
        newHead = currentHead
        currentHead = nextHead
    }
    return newHead
}