package datastructure.string.leetcode

private fun main(){
    println(isPalindromeOP("A man, a plan, a canal: Panama"))
}

private fun isPalindrome(s: String): Boolean {
    if (s.isEmpty()){
        return true
    }
//    val strL = s.toLowerCase()
//    var str = ""
//    for(i in strL){
//        if (i.toInt() >= 'a'.toInt() && i.toInt() <= 'z'.toInt()){
//            str += i
//        }
//    }
//    return str == str.reversed()

    val str = s.toLowerCase().replace("[^a-z0-9]", "")
    var i = 0
    var j: Int = str.length - 1
    while (i <= j) {
        if (s[i] != s[j]) {
            return false
        }
        i++
        j--
    }
    return true
}

private fun isPalindromeOP(s: String): Boolean {
    if (s.isEmpty()) {
        return true
    }
    var head = 0
    var tail = s.length - 1
    var cHead: Char
    var cTail: Char
    while (head <= tail) {
        cHead = s[head]
        cTail = s[tail]
        if (!Character.isLetterOrDigit(cHead)) {
            head++
        } else if (!Character.isLetterOrDigit(cTail)) {
            tail--
        } else {
            if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                return false
            }
            head++
            tail--
        }
    }
    return true
}