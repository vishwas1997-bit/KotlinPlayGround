package datastructure.array.leetcode

//Remove Element

private fun main(){
    val output = removeElement(intArrayOf(3,2,2,3),3)
    for (k in output){
        print(output[k])
    }
}

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]

private fun removeElement(nums: IntArray, `val`: Int): IntArray {
    var i = 0
    for (n in nums){
        if (n != `val`){
            nums[i] = n
            i++
        }
    }
    return nums
}
