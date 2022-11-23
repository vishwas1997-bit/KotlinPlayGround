package datastructure.array.leetcode

private fun main() {
    println(generate(5))
}

/**
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

private fun generate(numRows: Int): List<List<Int>> {
    val triangle = ArrayList<ArrayList<Int>>()
    for (i in 0 until numRows) {
        val row = ArrayList<Int>()
        for (j in 0 until i + 1) {
            if (j == 0 || j == i) {
                row.add(1)
            } else {
                row.add(triangle[i - 1][j - 1] + triangle[i - 1][j])
            }
        }
        triangle.add(row)
    }
    return triangle
}