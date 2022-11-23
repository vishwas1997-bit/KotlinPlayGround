package datastructure.array.leetcode

private fun main(){
    val output = sortArrayByParityWithTwoPointerApproach(intArrayOf(3,1,2,4))
    for (i in output){
        print(i)
    }
}

/**
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Input: nums = [2,4,1,3]
 * Output: [2,4,1,3]
 */
private fun sortArrayByParity(nums: IntArray): IntArray {
    var currentIndex = 0
    var value : Int
    for (i in nums.indices){
        if (nums[i] % 2 == 0){
            value = nums[currentIndex]
            nums[currentIndex] = nums[i]
            nums[i] = value
            currentIndex++
        }
    }
    return nums
}

private fun sortArrayByParityWithTwoPointerApproach(nums: IntArray): IntArray {
    var startIndex = 0
    var endIndex = nums.size - 1
    var value : Int
    while (startIndex <= endIndex){
        if (nums[startIndex] % 2 == 0){
            startIndex++
        } else{
            if (nums[endIndex] % 2 == 0){
                value = nums[startIndex]
                nums[startIndex] = nums[endIndex]
                nums[endIndex] = value
            }
            startIndex++
            endIndex--
        }
    }
    return nums
}