package datastructure.stack.leetcode

import java.util.*

private fun main(){
    val a = "a"
    val b = "B"
    println(a.equals(b,true))
//    println(makeGood("leEeetcode"))
}
private fun makeGood(s: String): String {
    val stack = Stack<Char>()
    for (i in s.toCharArray()){
        if (stack.isNotEmpty()){
            if (stack.peek() == i){
                stack.pop()
            }
        }
       stack.push(i)
    }
    return stack.toString()
}