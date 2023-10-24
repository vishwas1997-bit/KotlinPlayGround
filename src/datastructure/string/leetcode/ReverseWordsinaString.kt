package datastructure.string.leetcode

private fun main(){
    println(reverseWords("the sky is blue"))
}

private fun reverseWords(s: String): String {
    var str = ""
    for(i in s.length - 1 downTo 0){
        if (s[i] != ' ' && str.isNotEmpty() && str[str.length-1] != ' '){
            str += ' '
        } else{
            str += s[i]
        }
    }
    return str
}

