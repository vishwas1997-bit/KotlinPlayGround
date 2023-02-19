package datastructure.array.leetcode

import java.util.Arrays

private fun main(){
    val output = arrangeZeroTest(intArrayOf(0,1,2,0,3))
    for (i in output){
        print(i)
    }
}

/**
 * input = [0,1,2,0,3]
 * output = [1,2,3,0,0]
 */

//bi = 3, ni = 5
//output = [1,2,3,0,0]
private fun arrangeZero(nums : IntArray) : IntArray{
    var baseValueIndex = 0
    var nextValueIndex: Int
    if (nums.isEmpty() || nums.size == 1){
        return nums
    } else{
        nextValueIndex = 1
    }

    //baseValueIndex = 0, nextValueIndex = 1
    while (nums.size > nextValueIndex){
        if (nums[baseValueIndex] != 0){
            baseValueIndex++
            nextValueIndex++
        } else{
            if (nums[nextValueIndex] != 0){
                nums[baseValueIndex] = nums[nextValueIndex]
                nums[nextValueIndex] = 0
                baseValueIndex++
                nextValueIndex++
            } else{
                nextValueIndex++
            }
        }
    }
    
    return nums
}

private fun arrangeZeroTest(nums : IntArray) : IntArray{
    if (nums.isEmpty()){
        return nums
    }
    val output = IntArray(nums.size)
    Arrays.fill(output,0)
    var pointer = 0
    for (i in nums){
        if (i != 0){
            output[pointer++] = i
        }
    }
    return output
}