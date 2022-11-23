package datastructure.array

fun main(){

    val nums = intArrayOf(3,2,3)
    val target = 6
    val output = twoSumII(nums, target)
    for (i in output.indices){
        println(output[i])
    }
}
// nums = [2,7,11,15], target = 9
// output = [0,1]
private fun twoSum(nums : IntArray,target : Int) : IntArray{
    val output = intArrayOf(-1,-1)
    for (i in nums.indices){
        var j = i +1
        while(j < nums.size){
            if (nums[i] + nums[j] == target){
                output[0] = i
                output[1] = j
                break
            }
            j++
        }
    }
    return output
}

private fun twoSumII(nums: IntArray, target: Int): IntArray {
    val output = intArrayOf(-1,-1)
    val hashMap = HashMap<Int,Int>()
    for (i in nums.indices){
        if(hashMap.contains(nums[i])){
            output[0] = hashMap.getValue(nums[i])
            output[1] = i
        }
        hashMap[target - nums[i]] = i
    }
    return output
}