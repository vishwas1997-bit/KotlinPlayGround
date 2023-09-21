package datastructure.string.leetcode


private fun main(){
    println(lengthOfLongestSubstring("abcabcbb"))
}

private fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()){
        return 0
    }
    var length = Int.MIN_VALUE
    for (i in s.indices){
        var j = i
        val hashMap = HashMap<Char,Char>()
        while (j < s.length && !hashMap.containsKey(s[j])){
            hashMap[s[j]] = s[j]
            j++
        }
        length = Math.max(length, j - i)
    }
    return length
}

fun lengthOfLongestSubstringOp(s: String): Int {
    var i = 0
    var j = 0
    var max = 0
    val set: MutableSet<Char> = HashSet()
    while (j < s.length) {
        if (!set.contains(s[j])) {
            set.add(s[j++])
            max = Math.max(max, set.size)
        } else {
            set.remove(s[i++])
        }
    }
    return max
}