package datastructure.array.leetcode

private fun main(){
    println(arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c")))
}

/**
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 */
private fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    var str1 = ""
    var str2 = ""
    word1.forEach { str1 += it }
    word2.forEach { str2 += it }
    return str1 == str2
}