package datastructure.array.leetcode

/**
(1) Input: nums = [3,0,1]
    Output: 2

(2) Input: nums = [0,1]
    Output: 2

(3) Input: nums = [3,6,4,2,9,5,7,0,1]
    Output: 8
*/
private fun main(){
    println(missingNumber(intArrayOf(3,6,4,2,9,5,7,0,1)))
}


private fun missingNumber(nums: IntArray): Int {
    for (i in 0..nums.size){
        if (!nums.contains(i)){
            return i
        }
    }
    return 0
}