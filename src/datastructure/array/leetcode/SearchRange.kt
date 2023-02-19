package datastructure.array.leetcode


private fun main(){
    val output = searchRange(intArrayOf(5,7,8,8,9,10),8)
    for (i in output){
        println(i)
    }
}

private fun searchRange(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    result[0] = findFirst(nums, target)
    result[1] = findLast(nums, target)
    return result
}

private fun findFirst(nums: IntArray, target: Int): Int {
    var idx = -1
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] < target) {
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else {
            idx = mid
            end = mid - 1
        }
    }
    return idx
}

private fun findLast(nums: IntArray, target: Int): Int {
    var idx = -1
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] < target) {
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else {
            idx = mid
            start = mid + 1
        }
    }
    return idx
}