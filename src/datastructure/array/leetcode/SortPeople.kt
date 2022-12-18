package datastructure.array.leetcode

private fun main(){
    val output = sortPeople(arrayOf("Mary","John","Emma"), intArrayOf(180,165,170))
    output.forEach { print(it) }
}

/**
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
 */
private fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val hashMap = HashMap<Int, String>()
    val output = mutableListOf<String>()
    for (i in heights.indices){
        hashMap[heights[i]] = names[i]
    }
    heights.sortDescending()
    for (i in heights.indices){
        output.add(hashMap[heights[i]]!!)
    }
    return output.toTypedArray()
}