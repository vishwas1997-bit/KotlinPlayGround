package datastructure.queue

import java.util.*

fun main(){
    val queue : Queue<Int> = ArrayDeque<Int>()
    queue.add(0)
    queue.add(1)
    queue.add(2)
    queue.add(3)
    queue.add(4)
    queue.add(5)

    println("Before : $queue")
    queue.remove()
    println("After : $queue")
}