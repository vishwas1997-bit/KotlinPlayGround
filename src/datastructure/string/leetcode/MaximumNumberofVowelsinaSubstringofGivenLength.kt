package datastructure.string.leetcode

private fun main(){
    println(maxVowels("abciiidef", 2))
}

fun maxVowels(s: String, k: Int): Int {
    var vowel = 0
    for (i in 0 until k) {
        if (isVowel(s[i])) vowel++
    }
    var max = vowel
    for (i in k until s.length) {
        if (isVowel(s[i])) vowel++
        if (isVowel(s[i - k])) vowel--
        max = Math.max(max, vowel)
    }
    return max
}

private fun isVowel(c: Char): Boolean {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
}