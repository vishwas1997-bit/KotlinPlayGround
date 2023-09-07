package datastructure.array.leetcode


private fun main(){
    println(fourSumCountOP(intArrayOf(0), intArrayOf(0), intArrayOf(0), intArrayOf(0)))
}

// Time complexity = O(n^3)
private fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
    val map: MutableMap<Int, Int> = HashMap()
    for (l in nums4) {
        map[l] = map.getOrDefault(l, 0) + 1
    }
    var count = 0
    for (i in nums1){
        for (j in nums2){
            for (k in nums3){
                count += map.getOrDefault(-(i + j + k), 0)
            }
        }
    }
    return count
}

private fun fourSumCountOP(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
    val map: MutableMap<Int, Int> = HashMap()
    var count = 0
    for (l in nums4)
        for(m in nums3)
            map[l+m] = map.getOrDefault(l+m, 0) + 1

    for (i in nums1){
        for (j in nums2){
            count += map.getOrDefault(-(i + j), 0)
        }
    }
    return count
}