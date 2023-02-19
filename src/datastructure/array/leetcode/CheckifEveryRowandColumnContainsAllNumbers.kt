package datastructure.array.leetcode

/**
Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.

Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
 */
private fun main(){
    println(checkValid(arrayOf(intArrayOf(1,2,3), intArrayOf(3,1,2), intArrayOf(2,3,1))))
}

private fun checkValid(matrix: Array<IntArray>): Boolean {
    val n = matrix.size
    for (r in 0 until n){
        val row: MutableSet<Int> = HashSet()
        val col: MutableSet<Int> = HashSet()
        for (c in 0 until n) {
            if (!row.add(matrix[r][c]) || !col.add(matrix[c][r])) {
                return false
            }
        }
    }
    return true
}

