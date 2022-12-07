package datastructure.array.leetcode

private fun main(){
    println(mostWordsFound(arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")))
}

/**
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
Explanation:
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */
private fun mostWordsFound(sentences: Array<String>): Int {
    var maxCount = 0
    sentences.forEach { maxCount = Math.max(maxCount, it.split(" ").size) }
    for (txt in sentences){
        maxCount = Math.max(maxCount, txt.split(" ").size)
    }
    return maxCount
}