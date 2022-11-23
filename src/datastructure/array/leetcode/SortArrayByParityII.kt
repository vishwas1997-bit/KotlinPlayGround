package datastructure.array.leetcode

private fun main(){
    val output = sortArrayByParityII(intArrayOf(4,2,5,7))
    for(i in output){
        print(i)
    }
}

/**
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 */
private fun sortArrayByParityII(nums: IntArray): IntArray {
    var i = 0
    var j = 1
    val res = IntArray(nums.size)
    for (k in nums.indices){
        if (nums[k] % 2 == 0){
            res[i] = nums[k]
            i += 2
        } else {
            res[j] = nums[k]
            j += 2
        }
    }
    return res
}