package datastructure.array.leetcode

/**
Input: nums = [2,5,6,0,0,1,2], target = 5
Output: true
 */
private fun main(){
    println(search(intArrayOf(2,5,6,0,0,1,2), 5))
}

private fun search(nums: IntArray, target: Int): Boolean {
    var start = 0
    var end = nums.size - 1
    var mid : Int

    while (start <= end){
        mid =  start + (end - start) / 2

        if (nums[mid] == target){
            return true
        }

        if (nums[mid] < nums[end] || nums[mid] < nums[start]){
            if (target > nums[mid] && target <= nums[end]){
                start = mid + 1
            } else{
                end = mid - 1
            }
        } else if (nums[mid] > nums[start] || nums[mid] > nums[end]){
            if (target < nums[mid] && target >= nums[start]){
                end = mid - 1
            } else{
                start = mid + 1
            }
        } else{
            end --
        }
    }
    return false
}