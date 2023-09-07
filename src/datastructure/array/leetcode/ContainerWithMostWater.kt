package datastructure.array.leetcode

private fun main(){
    println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
}

private fun maxArea(height: IntArray): Int {
    var start = 0
    var right = height.size - 1
    var max = 0
    while (start < right){
        val w = right - start
        val h = Math.min(height[start], height[right])
        val area =  w * h
        max = Math.max(max, area)
        if (height[start] < height[right]){
            start++
        } else if (height[right] < height[start]){
            right--
        } else{
            start++
            right--
        }
    }
    return max
}