package datastructure.array.leetcode

import java.util.*


private fun main(){
    println(findContentChildren(intArrayOf(5,6), intArrayOf(1,2,3)))
}

/**
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 */
private fun findContentChildren(g: IntArray, s: IntArray): Int {
    Arrays.sort(g)
    Arrays.sort(s)
    var i = 0
    var j = 0
    while (i < g.size && j < s.size){
        if (g[i] <= s[j]){
            i++
        }
        j++
    }
    return i
}