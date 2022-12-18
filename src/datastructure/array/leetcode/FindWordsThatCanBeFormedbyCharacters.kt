package datastructure.array.leetcode

private fun main() {
    println(
        countCharacters(
            arrayOf(
                "cat","bt","hat","tree"
            ), "atach"
        )
    )
}

/**
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 */
private fun countCharacters(words: Array<String>, chars: String): Int {
    var sum = 0
    val count = IntArray(26)
    for(i in chars.indices){
        count[chars[i] - 'a']++
    }
    words.forEach {
        val arry = count.clone()
        var Tcount = 0
        for (j in it.indices){
            val vl = arry[it[j] - 'a']--
            if (vl < 0){
                continue
            }
            Tcount++
        }
        if (Tcount == it.length){
            sum += it.length
        }
    }
    return sum
}