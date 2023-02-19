package datastructure.array.leetcode

/**
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */
private fun main(){
    println(searchMatrix(arrayOf(intArrayOf(1,3,5,7)
        , intArrayOf(10,11,16,20)
        , intArrayOf(23,30,34,60))
        ,13))
}

private fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    val n = matrix[0].size
    for(r in matrix.indices){
        if(target < matrix[r][0]){
            continue
        }
        if (target > matrix[r][n-1]){
            continue
        }
        var start = 0
        var end = n - 1
        while (start <= end){
            val mid = start + (end - start) / 2

            if (target == matrix[r][mid]){
                return true
            }

            if (target < matrix[r][mid]){
                end = mid - 1
            } else{
                start = mid + 1
            }
        }
    }
    return false
}