package datastructure.array.leetcode

private fun main(){
    val output = twoSum(intArrayOf(-1,0), -1)
    for(i in output){
        print("$i\t")
    }
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var p1 = 0
    var p2 = numbers.size - 1

    while (p1 < p2){
        val sum = numbers[p1] + numbers[p2]
        if (sum == target){
            return intArrayOf(++p1, ++p2)
        } else if (sum > target){
            p2--
        } else {
            p1++
        }
    }
    return intArrayOf(-1, -1)
}