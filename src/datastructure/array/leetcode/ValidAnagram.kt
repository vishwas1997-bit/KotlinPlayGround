package datastructure.array.leetcode

/**
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
 */
private fun main(){
    println(isAnagram("rat","car"))
}

private fun isAnagram(s: String, t: String): Boolean {
    val char = IntArray(26){ 0 }
    for (i in t){
        char[i - 'a']++
    }

    for (c in s){
        if (char[c - 'a'] > 0){
            char[c - 'a']--
        } else{
            return false
        }
    }

    return true
}