package datastructure.array.leetcode

private fun main(){
    println(firstPalindrome(arrayOf("xngla","e","itrn","y","s","pfp","rfd")))
}

/**
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 */
private fun firstPalindrome(words: Array<String>): String {
    var i : Int
    var j : Int
    var index = -1
    for (k in words.indices){
        i = 0
        j = words[k].length - 1
        if (words[k].length == 1){
            return words[k]
        }
        while (i < j){
            if (words[k][i] == words[k][j]){
                i++
                j--
                index = k
            } else{
                index = -1
                break
            }
        }
        if(index != -1){
            return words[index]
        }
    }
    return ""
}