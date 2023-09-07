package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode


private fun main(){
    val node_1 = ListNode(1)
    val node_2 = ListNode(1)
    val node_3 = ListNode(2)
    val node_4 = ListNode(1)
    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    val output = isPalindrome(node_1)
    print(output)
}

private fun isPalindrome(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    var temp: ListNode?
    var prev: ListNode?
    while (fast != null && fast.next != null){
        slow = slow?.next
        fast = fast.next!!.next
    }

    temp = slow
    slow = slow?.next
    temp?.next = null
    prev = temp
    while (slow != null){
        temp = slow.next
        slow.next = prev
        prev = slow
        slow = temp
    }

    fast = head
    slow = prev
    while (slow != null){
        if (fast?.`val`!= slow.`val`){
            return false
        }
        slow = slow.next
        fast = fast.next
    }

    return true
}