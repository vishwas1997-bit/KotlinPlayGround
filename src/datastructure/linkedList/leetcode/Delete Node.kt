package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode

fun main(){
    val list1 = ListNode(4)
    val list2 = ListNode(5)
    val list3 = ListNode(1)
    val list4 = ListNode(9)
    val deleteNode = ListNode(5)
    list1.next = list2
    list2.next = list3
    list3.next = list4
//    list4.next = list5
    ListNode.printList(deleteNode(list1,deleteNode))
}

private fun deleteNode(nodes: ListNode?,deleteNode: ListNode?) : ListNode?{
    while (nodes != null){
//        if (nodes.`val` == deleteNode?.`val`){
//            nodes.next =
//        } else{
//
//        }
    }
    return nodes
}