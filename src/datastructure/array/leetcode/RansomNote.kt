package datastructure.array.leetcode

/**
Input: ransomNote = "a", magazine = "b"
Output: false

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
private fun main() {
    println(canConstruct("aa", "aab"))
}

private fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val char = IntArray(26) { 0 }
    for (i in magazine) {
        char[i - 'a']++
    }

    for (i in ransomNote) {
        if (char[i - 'a'] > 0) {
            char[i - 'a']--
        } else {
            return false
        }
    }
    return true
}