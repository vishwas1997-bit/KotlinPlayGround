package datastructure.stack.leetcode

import java.util.*


private fun main(){
    println(isValid("[(])"))
}

private fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (c in s.toCharArray()) {
        if (c == '(') stack.push(')')
        else if (c == '{') stack.push('}')
        else if (c == '[') stack.push(']')
        else if (stack.isEmpty() || stack.pop() != c)
            return false
    }
    return stack.isEmpty()
}