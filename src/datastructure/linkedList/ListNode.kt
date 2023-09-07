package datastructure.linkedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object{
        fun printList(list : ListNode?){
            var head = list
            while (head != null){
                print(head.`val`)
                print(" -> ")
                head = head.next
            }
        }
    }
}