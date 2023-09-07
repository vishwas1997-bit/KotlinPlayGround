package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

private fun main(){

    val list1 = ListNode(2)
    val list2 = ListNode(4)
    val list3 = ListNode(3)
    list1.next = list2
    list2.next = list3

    val list4 = ListNode(5)
    val list5 = ListNode(6)
    val list6 = ListNode(4)
    list4.next = list5
    list5.next = list6


    val output = addTwoNumbers(list1,list4)
    ListNode.printList(output)
}

private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val outputList = ListNode(0)
    var currentList = outputList
    var carray = 0
    var sum = 0
    var firstList = l1
    var secondList = l2
    while (firstList != null || secondList != null || carray == 1){
        sum = 0
        if (firstList != null){
            sum += firstList.`val`
            firstList = firstList.next
        }

        if (secondList != null){
            sum += secondList.`val`
            secondList = secondList.next
        }
        sum += carray
        carray = sum / 10
        val list = ListNode(sum % 10)
        currentList.next = list
        currentList = currentList.next!!
    }

    return outputList.next
}