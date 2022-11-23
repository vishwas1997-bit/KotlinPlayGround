package datastructure.stack

import java.util.*

fun main(){
    val stack = Stack<Int>()
    stack.push(5)
    stack.push(4)
    stack.push(3)
    stack.push(2)
    stack.push(1)
    stack.push(0)

    println(stack.search(1))

    println("Before : $stack")
    stack.pop()
    println("After : $stack")
}