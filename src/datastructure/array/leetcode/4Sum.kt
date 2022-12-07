package datastructure.array.leetcode

private fun main(){
    println(fourSum(intArrayOf(1,0,-1,0,-2,2),0))
}

/**
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 */
private fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    // nums = [-2,-1,0,0,1,2]
    nums.sort()
    val list = HashSet<List<Int>>()
    for (i in 0 until nums.size - 3){
        var j = i + 1
        var k = j + 1
        var l = nums.size - 1
        while (k < l){
            val sum = nums[i] + nums[j] + nums[k] + nums[l]
            if (sum == target) {
                list.add(
                    listOf(
                        nums[i],
                        nums[j++],
                        nums[k++],
                        nums[l--]
                    )
                )
            }else if (sum > target){
                l--
            } else{
                j++
                k++
            }
        }
    }
    return ArrayList(list)
}