package datastructure.array.leetcode

private fun main(){
    println(truncateSentence("chopper is not a tanuki", 5))
}

/**
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
 */
private fun truncateSentence(s: String, k: Int): String {
    var str = ""
    val arr = s.split(" ")
    for (i in 0 until k){
        str += " "+arr[i]
    }
    return str.substring(1,str.length)
}