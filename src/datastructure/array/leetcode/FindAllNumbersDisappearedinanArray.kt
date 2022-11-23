package datastructure.array.leetcode

import java.util.*


private fun main(){
    println(findDisappearedNumbers2(intArrayOf(4,3,2,7,8,2,3,1)))
}

private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val list = ArrayList<Int>()
    val hashtable = Hashtable<Int,Int>()
    for (i in nums.indices){
        hashtable[nums[i]] = i
    }

    for (i in 0..nums.size){
        if (i != 0 && !hashtable.containsKey(i)){
            list.add(i)
        }
    }
    return list
}

fun findDisappearedNumbers2(nums: IntArray): List<Int> {
    for (i in nums.indices) {
        while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
            val tmp = nums[i]
            nums[i] = nums[tmp - 1]
            nums[tmp - 1] = tmp
        }
    }
    val res: MutableList<Int> = ArrayList()
    for (i in nums.indices) {
        if (nums[i] != i + 1) {
            res.add(i + 1)
        }
    }
    return res
}