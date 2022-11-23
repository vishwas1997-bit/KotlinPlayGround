package datastructure.array.leetcode

import java.util.Hashtable

/**
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 */
private fun main(){
    println(checkIfExistUsingHashTable(intArrayOf(3,1,7,11)))
}

/**
 * Brute force approach
 * time complexity = O(n^2)
 * space complexity = O(1)
 */
private fun checkIfExist(arr: IntArray): Boolean {
    var ifPresent = false
    for (i in arr.indices){
        for (j in arr.indices){
            if (i != j){
                if (arr[i] == 2 * arr[j]){
                    ifPresent = true
                }
            }
        }
    }
    return ifPresent
}

/**
 * Using HashTable
 * time complexity = O(n^2)
 * space complexity = O(1)
 */
private fun checkIfExistUsingHashTable(arr: IntArray): Boolean {
    val table = Hashtable<Int,Int>()
    for (i in arr.indices){
        if (table.containsKey(arr[i] * 2) || (table.containsKey(arr[i] / 2) && arr[i] % 2 == 0)){
            return true
        }
        table[arr[i]] = i
    }
    return false
}