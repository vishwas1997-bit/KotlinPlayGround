package datastructure.array.leetcode

private fun main(){
    println(canJump(intArrayOf(5,9,3,2,1,0,2,3,3,1,0,0)))
}

private fun canJump(nums: IntArray): Boolean {
    if(nums.size == 1){
        return true
    }
    if (nums[0] == 0){
        return false
    }
    val length = nums.size - 1
    var previousIndexPower = 0
    for (i in 0 until nums.size - 1){
        if (nums[i] >= length - i) {
            return true
        } else if (nums[i] == 0 && previousIndexPower > 0) {
            previousIndexPower--
            continue
        } else if (nums[i] == 0 && previousIndexPower <= 0) {
            return false
        } else {
            previousIndexPower = Math.max(nums[i], previousIndexPower)
            previousIndexPower--
        }
    }
    return false
}