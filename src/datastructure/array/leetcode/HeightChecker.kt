package datastructure.array.leetcode

private fun main(){
    println(heightChecker(intArrayOf(1,2,3,4,5)))
}
private fun heightChecker(heights: IntArray): Int {
    if (heights.isEmpty()){
        return 0
    }
    val sortedArray : IntArray = heights.sortedArray()
    var count = 0
    for (i in heights.indices){
        if (heights[i] != sortedArray[i]){
            count++
        }
    }
    return count
}