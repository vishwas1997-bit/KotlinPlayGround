package datastructure.linkedList.leetcode

import datastructure.linkedList.ListNode


private fun main(){
    val node_a = ListNode(4)
    val node_b = ListNode(1)
    val node_c = ListNode(8)
    val node_d = ListNode(4)
    val node_e = ListNode(5)
    val node_f = ListNode(5)
    val node_g = ListNode(6)
    val node_h = ListNode(1)

    //first linked list
    node_a.next = node_b
    node_b.next = node_c
    node_c.next = node_d
    node_d.next = node_e

    // second linked list
    node_f.next = node_g
    node_g.next = node_h
    node_h.next = node_c

    val output = getIntersectionNode(node_a, node_f)
    ListNode.printList(output)
}

private fun getIntersectionNode(headA: ListNode?, headB:ListNode?):ListNode? {
    val hashMap = HashMap<ListNode, ListNode>()
    var head = headA
    while (head != null){
        hashMap[head] = head
        head = head.next
    }

    var headS  = headB
    while (headS != null){
        if (hashMap.containsKey(headS)){
            return hashMap[headS]
        }
        headS = headS.next
    }
    return null
}

private fun getIntersectionNodeOP(headA: ListNode?, headB: ListNode?): ListNode? {
    var a = headA
    var b = headB
    while (a != b) {
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }
    return a
}
