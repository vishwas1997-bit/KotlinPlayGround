package datastructure.linkedList

import java.util.*

fun main(){
    val list = LinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
//    list.offerFirst()
//    list.offer()
//    list.remove()
//    list.add(0,4)
    println("Before : $list")
    list.remove()
    println("After : $list")

}