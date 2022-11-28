package datastructure.array.leetcode

private fun main() {
    println(arithmeticTriplets(intArrayOf(4,5,6,7,8,9),2))
}

/**
 * i < j < k,
 * nums[j] - nums[i] == diff, and
 * nums[k] - nums[j] == diff.
 *
 * Input: nums = [0,1,4,6,7,10], diff = 3
 * Output: 2
 * Explanation:
 * (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
 * (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 *
 * Input: nums = [4,5,6,7,8,9], diff = 2
 * Output: 2
 * Explanation:
 * (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
 * (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
 */
private fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
    var count = 0
    for (i in 0 until nums.size - 2){
        var j = i + 1
        var k = nums.size - 1
        while (j < k){
            val firstValue = nums[j] - nums[i]
            val secondValue =  nums[k] - nums[j]
            if (firstValue == diff && secondValue == diff){
                j++
                k--
                count++
            } else if (firstValue < diff){
                j++
            } else {
                k--
            }
        }
    }
    return count
}