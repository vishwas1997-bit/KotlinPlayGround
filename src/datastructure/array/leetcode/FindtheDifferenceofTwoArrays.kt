package datastructure.array.leetcode

private fun main(){
    println(findDifference(intArrayOf(1,2,3,3), intArrayOf(1,1,2,2)))
}

private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val set1 = HashSet<Int>()
    val set2 = HashSet<Int>()
    val list1 = ArrayList<Int>()
    val list2 = ArrayList<Int>()

    for(i in nums1){
        set1.add(i)
    }

    for(i in nums2){
        set2.add(i)
    }

    for(i in set1){
        if(!set2.contains(i)){
            list1.add(i)
        }
    }

    for(i in set2){
        if(!set1.contains(i)){
            list2.add(i)
        }
    }
    return mutableListOf(list1, list2)
}