package datastructure.array.leetcode

private fun main(){
    println(restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3)))
}

/**
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */
private fun restoreString(s: String, indices: IntArray): String {
    val arr = CharArray(indices.size)
    var str = ""
    for (i in indices.indices){
        arr[indices[i]] = s[i]
    }
    arr.forEach { str += it }
    return str
}