package datastructure.array.leetcode

private fun main(){
    val output = sortColors(intArrayOf(2,0,2,1,1,0))
    for (i in output){
        print(i)
    }
}

private fun sortColors(nums: IntArray): IntArray {
    var zeroIndex = 0
    var twoIndex = nums.size - 1
    var i = 0
    while (i <= twoIndex){
        when(nums[i]){
            0 -> swap(nums,zeroIndex++,i++)
            2-> swap(nums, twoIndex--, i)
            1 -> i++
        }
    }
    return nums
}

private fun swap(nums: IntArray, i: Int, j: Int){
    val temp = nums[j]
    nums[j] = nums[i]
    nums[i] = temp
}

