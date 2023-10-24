package datastructure.array.leetcode

private fun main() {
    println(maxOperations(intArrayOf(4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4), 2))
}

private fun maxOperations(nums: IntArray, k: Int): Int {
    val hashMap = HashMap<Int, Int>()
    var count = 0

    for (i in nums.indices) {
        if (hashMap.containsKey(k - nums[i]) && hashMap[k - nums[i]]!! > 0) {
            count++
            hashMap[nums[i]] = hashMap[nums[i]]!! - 1
        } else {
            hashMap[nums[i]] = hashMap.getOrDefault(nums[i], 0) + 1
        }
    }

    return count
}