package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

fun main(){
    val list1 = ListNode(1)
    val list2 = ListNode(1)
    val list3 = ListNode(2)
    val list4 = ListNode(3)
    val list5 = ListNode(3)
    list1.next = list2
    list2.next = list3
    list3.next = list4
    list4.next = list5
    ListNode.printList(deleteDuplicates(list1))
}

private fun deleteDuplicates(head: ListNode?): ListNode? {
    if(head == null){
        return head
    }
    val a = head.`val`
    val next = head.next
    if (a == next?.`val`){
        head.next = next.next
        deleteDuplicates(head)
    } else{
        deleteDuplicates(next)
    }
    return head
}