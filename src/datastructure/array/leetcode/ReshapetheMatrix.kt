package datastructure.array.leetcode

/**
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */
private fun main(){
    val output = matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)),1,4)
    for (i in output){
        for (j in i){
            print("$j \t")
        }
        println()
    }
}

private fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val n: Int = mat.size
    val m: Int = mat[0].size
    if (r * c != n * m) return mat
    val res = Array(r) { IntArray(c) }
    for (i in 0 until r * c){
        res[i / c][i % c] = mat[i / m][i % m]
    }
    return res
}