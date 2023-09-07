package datastructure.string.leetcode

fun main(){
    println(lengthOfLastWord("   fly me   to   the moon  "))
}

private fun lengthOfLastWord(s: String): Int {
    var length = 0
    for(i in s.indices){
        if(s[i].isLetter()){
            length++
        } else if(i != s.length - 1){
            length = 0
        }
    }
    return length
}