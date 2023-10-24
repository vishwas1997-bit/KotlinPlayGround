package datastructure.string.leetcode

import java.util.*

fun main() {
    println(reverseVowels("lpluyr"))
}

private fun reverseVowels(s: String): String {
    val stack = Stack<Char>()
    val str = s.toCharArray()
    for (i in str) {
        if (isVowel(i)) {
            stack.push(i)
        }
    }

    for (k in str.indices) {
        if (isVowel(str[k])) {
            str[k] = stack.pop()
        }
    }
    var newStr = ""
    for (i in str){
        newStr += i
    }
    return newStr
}
private fun isVowel(s: Char): Boolean {
    when (s) {
        'a' ->
            return true

        'A' ->
            return true

        'e','E' ->
            return true

        'i','I'->
            return true

        'o','O' -> return true
        'u', 'U'-> return true
        else -> {
            return false
        }
    }
}