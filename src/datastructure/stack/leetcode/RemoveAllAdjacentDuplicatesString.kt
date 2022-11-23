package datastructure.stack.leetcode

import java.util.*

private fun main(){
    println(removeDuplicates("abbaca"))
}

private fun removeDuplicates(s: String): String {
    var stack = Stack<Char>()
    var str = ""
    for(i in s.toCharArray()){
        if(stack.isNotEmpty()){
            if(i == stack.peek()){
                stack.pop()
            } else{
                stack.push(i)
            }
        } else{
            stack.push(i)
        }
    }
    for (i in stack.toCharArray()){
        str+=i
    }

    return str
}