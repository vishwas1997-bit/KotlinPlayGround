package datastructure.array.leetcode

private fun main(){
    println(prefixCount(arrayOf("pay","attention","practice","attend"),"at"))
}

/**
 * Input: words = ["pay","attention","practice","attend"], pref = "at"
 * Output: 2
 * Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
 */
private fun prefixCount(words: Array<String>, pref: String): Int {
    return words.count { it.startsWith(pref)}
}