package datastructure.array.leetcode

//Plus One
fun main(){
    val input = plusOneVk(intArrayOf(8,9,9,9))
    for (n in input){
        print(n)
    }
}

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Input: digits = [9]
//Output: [1,0]
fun plusOneVk(digits: IntArray): IntArray {
    val output = IntArray(digits.size + 1)
    for (i in digits.size -1 downTo 0){
        if (digits[i] != 9){
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    output[0] = 1

    return output
}

fun plusOne(digits: IntArray): IntArray {
    val n = digits.size
    for (i in n -1 downTo 0){
        if (digits[i] < 9){
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    val newNumber = IntArray(n + 1)
    newNumber[0] = 1

    return newNumber
}