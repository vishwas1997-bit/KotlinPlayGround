package datastructure.array.leetcode


private fun main(){
    println(search(intArrayOf(4,5,6,7,0,1,2),0))
}

private fun search(nums: IntArray, target: Int): Int {
    val minIdx = findMinIdx(nums)
    if (target == nums[minIdx]) return minIdx
    val m: Int = nums.size
    var start = if (target <= nums[m - 1]) minIdx else 0
    var end = if (target > nums[m - 1]) minIdx else m - 1

    while (start <= end) {
        val mid = start + (end - start) / 2
        if (nums[mid] == target) {
            return mid
        } else if (target > nums[mid]) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    return -1
}

private fun findMinIdx(nums: IntArray): Int {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val mid = start + (end - start) / 2
        if (nums[mid] > nums[end]) start = mid + 1 else end = mid
    }
    return start
}