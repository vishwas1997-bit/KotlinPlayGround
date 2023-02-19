package datastructure.string.leetcode

import java.util.*


private fun main(){
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}

private fun longestCommonPrefix(strs: Array<String>): String {
    if (strs == null || strs.size === 0) return ""

    Arrays.sort(strs)
    val first = strs[0]
    val last = strs[strs.size - 1]
    var c = 0
    while (c < first.length) {
        if (first[c] == last[c]) c++ else break
    }
    return if (c == 0) "" else first.substring(0, c)
}