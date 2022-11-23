package datastructure.array.leetcode

//Merge Sorted Array

private fun main(){
    val output = mergeArray(intArrayOf(0),0, intArrayOf(1),1)
    for (i in output){
        print(i)
    }
}

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
    var length = m + n - 1
    var num1Pointer = m - 1
    var num2Pointer = n - 1

    // num1pointer = 2
    // length = 5
    // num2Pointer = 2
    while (num2Pointer >= 0){
        if (num1Pointer >= 0 && nums1[num1Pointer] > nums2[num2Pointer]){
            nums1[length--] = nums1[num1Pointer--]
        } else{
            nums1[length--] = nums2[num2Pointer--]
        }
    }
    return nums1
}

private fun mergeArray(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray{
    var i = m - 1
    var j = n - 1
    var k = m + n - 1
    while (j >= 0){
        if (i >= 0 && nums1[i] > nums2[j]){
            nums1[k] = nums1[i]
            i--
        } else{
            nums1[k] =  nums2[j]
            j--
        }
        k--
    }
    return nums1
}

