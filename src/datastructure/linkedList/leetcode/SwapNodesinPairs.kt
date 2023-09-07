package datastructure.linkedList.leetcode
import datastructure.linkedList.ListNode

private fun main(){
    val node_1 = ListNode(1)
    val node_2 = ListNode(2)
    val node_3 = ListNode(3)
    val node_4 = ListNode(4)
    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    val output = swapPairs2(node_1)
    ListNode.printList(output)
}

// Recursive solution
private fun swapPairs(head: ListNode?): ListNode? {
    if (head == null || head.next == null) return head
    val n = head.next
    head.next = swapPairs(head.next!!.next)
    n!!.next = head
    return n
}

// Iterative
private fun swapPairs2(head: ListNode?): ListNode? {
    if (head == null || head.next == null) return head
    var currentNode = head
    var previousNode = head
    val n = head.next
    while (currentNode != null && currentNode.next != null){
        val temp = currentNode.next
        currentNode.next = temp?.next
        temp?.next = currentNode
        currentNode = temp?.next?.next

        ListNode.printList(n)
        println()
    }
    return n
}