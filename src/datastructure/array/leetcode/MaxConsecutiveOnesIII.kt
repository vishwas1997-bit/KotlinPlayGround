package datastructure.array.leetcode

private fun main() {
    println(longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2))
}

private fun longestOnes(nums: IntArray, k: Int): Int {
    var i = 0
    var j = 0
    var z = k
    while (i < nums.size) {
        z -= if (nums[i++] == 1) 0 else 1
        if (z < 0) z += if (nums[j++] == 1) 0 else 1
    }
    return i - j
}