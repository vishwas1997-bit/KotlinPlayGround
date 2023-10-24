package datastructure.array.leetcode

private fun main(){
    val arr = productExceptSelf(intArrayOf(1,2,3,4))
    for(i in arr){
        print("\t"+i)
    }
}

private fun productExceptSelf(nums: IntArray): IntArray {
    var res = IntArray(nums.size)
    var left = 1
    res[0] = 1
    for(i in nums.indices){
        if(i > 0){
            left = left * nums[i - 1]
            res[i] = left
        }
    }
    var right = 1
    for(i in nums.size - 1 downTo 0){
        if(i < nums.size - 1){
            right = right * nums[i + 1]
            res[i] = res[i] * right
        }
    }
    return res
}