package datastructure.array.leetcode

fun main(){
    println(containsNearbyDuplicate(intArrayOf(1,0,1,1),1))
}

//Input: nums = [1,2,3,1], k = 3
//Output: true
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val set = HashMap<Int,Int>()
    for (i in nums.indices){
        if (set.contains(nums[i])){
            if (i - set[nums[i]]!! <= k) return true
        }
        set[nums[i]] = i
    }
    return false
}