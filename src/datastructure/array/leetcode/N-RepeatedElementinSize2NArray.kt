package datastructure.array.leetcode

private fun main(){
    println(repeatedNTimes(intArrayOf(1,2,3,3)))
}

private fun repeatedNTimes(nums: IntArray): Int {
    val hashMap = HashMap<Int, Int>()
    for (n in nums){
        if (hashMap.containsKey(n)){
            return n
        } else{
            hashMap[n] = 1
        }
    }
    return -1
}