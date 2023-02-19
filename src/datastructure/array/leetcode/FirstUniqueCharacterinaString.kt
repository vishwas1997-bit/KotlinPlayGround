package datastructure.array.leetcode

import java.util.Hashtable

/**
Input: s = "leetcode"
Output: 0

Input: s = "aabb"
Output: -1
 */
private fun main(){
    println(firstUniqChar("aabb"))
}

private fun firstUniqChar(s: String): Int {
    val hashtable = Hashtable<Char,Int>()
    for (i in s.indices){
        hashtable[s[i]] = hashtable.getOrDefault(s[i],0) + 1
    }

    for (i in s.indices){
        if(hashtable.getValue(s[i]) == 1){
            return s.indexOf(s[i])
        }
    }

    return -1
}