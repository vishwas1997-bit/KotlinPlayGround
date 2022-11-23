package datastructure.array.leetcode

import kotlin.math.abs
import kotlin.math.min

private fun main(){
    val output = shortestToCharII("aaab",'b')
    for (k in output){
        print("$k,")
    }
}

/**
 * Input: s = "loveleetcode", c = "e"
 * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 *
 * Input: s = "aaab", c = "b"
 * Output: [3,2,1,0]
 */
private fun shortestToChar(s: String, c: Char): IntArray {
    val charIndex = mutableListOf<Int>()
    for (i in s.indices){
        if (s[i] == c){
            charIndex.add(i)
        }
    }

    val answer = IntArray(s.length)
    for (k in s.toCharArray().indices){
        if (s[k] == c){
            answer[k] = 0
        } else{
            var closetValue = -1
            for (index in charIndex.indices){
                closetValue = if (closetValue != -1){
                    abs(min(closetValue,charIndex[index] - k  ))
                } else{
                    charIndex[index] - k
                }
            }
            answer[k] = closetValue
        }
    }

    return answer
}

private fun shortestToCharII(s: String, c: Char): IntArray {
    val n: Int = s.length
    var pos = -n
    val res = IntArray(n)
    for (i in 0 until n) {
        if (s[i] == c) pos = i
        res[i] = i - pos
    }
    for (i in pos - 1 downTo 0) {
        if (s[i] == c) pos = i
        res[i] = res[i].coerceAtMost(pos - i)
    }
    return res
}