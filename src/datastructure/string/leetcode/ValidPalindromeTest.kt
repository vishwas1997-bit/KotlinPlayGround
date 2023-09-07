package datastructure.string.leetcode

private fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

private fun isPalindrome(s: String): Boolean {
//    var newStr = ""
//    for (i in s.indices) {
//        if (s[i].isLetterOrDigit()) {
//            newStr += s[i].toLowerCase()
//        }
//    }

    if (s.isEmpty()) {
        return true
    }

    var p1 = 0
    var p2 = s.length - 1
    while (p1 < p2) {
        if (!s[p1].isLetterOrDigit()){
            p1++
        } else if (!s[p2].isLetterOrDigit()){
            p2--
        } else if(s[p1].equals(s[p2], ignoreCase = true)) {
            p1++
            p2--
        } else {
            return false
        }
    }

    return true
}