package datastructure.array.leetcode

//Search Insert Position
private fun main(){
    print(searchInsertPosition(intArrayOf(1,2,3,4,5,6,7,8,9),4))
}

//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Input: nums = [1,3,5,6], target = 7
//Output: 4

// Brute Force Approach
private fun searchInsert(nums: IntArray, target: Int): Int {
    var index = -1
    for(i in nums.indices){
        if(target == nums[i] || target < nums[i]){
            return i
        } else{
            index = i + 1
        }
    }
    return index
}

// Optimize Code
// [1,2,3,4,5,6,7,8,9] trg = 4, mid = 2
private fun searchInsertPosition(nums: IntArray, target: Int): Int {
    var startIndex = 0
    var endIndex = nums.size - 1
    while (startIndex <= endIndex){
        val mid = startIndex + (endIndex - startIndex) / 2

        if (nums[mid] == target){
            return mid
        }

        if (target < nums[mid]){
            endIndex = mid - 1
        } else{
            startIndex = mid + 1
        }
    }

    return -1
}