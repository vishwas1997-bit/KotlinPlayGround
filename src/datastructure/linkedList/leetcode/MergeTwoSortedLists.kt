package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

private fun main() {
    val obj = SolutionLinkedList()
    val list1 = ListNode(1)
    val list2 = ListNode(2)
    val list3 = ListNode(4)
    list1.next = list2
    list2.next = list3

    val list4 = ListNode(1)
    val list5 = ListNode(3)
    val list6 = ListNode(4)
    list4.next = list5
    list5.next = list6
    val list = obj.mergeTwoLists(list1, list4)
    ListNode.printList(list)
}

/**
 *list1 [1,2]
 * list2 [1,3]
 */
private class SolutionLinkedList {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) {
            return null
        }
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }
        list2.next = mergeTwoLists(list1, list2.next)
        return list2
    }
}

