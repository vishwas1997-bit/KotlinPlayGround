package datastructure.array.leetcode

//Contains Duplicate

fun main(){
    print(containsDuplicate(intArrayOf(2,14,18,22,22)))
}

//Input: nums = [1,2,3,1]
//Output: true
//Input: nums = [1,2,3,4]
//Output: false
//[1,1,1,3,3,4,3,2,4,2]


private fun containsDuplicate(nums: IntArray): Boolean {
   val set = HashSet<Int>()
    for (i in nums){
        if (set.contains(i)){
            return true
        }
        set.add(i)
    }
    return false
}