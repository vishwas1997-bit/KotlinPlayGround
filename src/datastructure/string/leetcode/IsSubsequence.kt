package datastructure.string.leetcode

private fun main(){
    println(isSubsequence("b", "abc"))
}


// Time Complexity = O(n)
// Space Complexity = O(1)
private fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < t.length){
        if(s[j] == t[i]){
            j++
        }
        i++
    }
    return j == s.length
}