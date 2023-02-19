package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

/**
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 */
private fun main(){
    val list1 = ListNode(1)
    val list2 = ListNode(2)
    val list3 = ListNode(3)
    val list4 = ListNode(4)
    val list5 = ListNode(5)
    val list6 = ListNode(6)
    val list7 = ListNode(7)
    val list8 = ListNode(8)
    val list9 = ListNode(9)
    val list10 = ListNode(10)
    val list11 = ListNode(11)
    val list12 = ListNode(12)
    list1.next = list2
    list2.next = list3
    list3.next = list4
    list4.next = list5
    list5.next = list6
    list6.next = list7
    list7.next = list8
    list8.next = list9
    list9.next = list10
    list10.next = list11
    list11.next = list12
    list12.next = list1
    println(hasCycle(list1))
    println(list4.hashCode())
}

private fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    while (fast != null && fast.next != null){
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast){
            println("slow : "+slow.hashCode())
            println("fast : "+fast.hashCode())
            return true
        }
    }
    return false
}