package datastructure.array.leetcode


private fun main() {
    println(getRowII(3))
}

/**
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 */
private fun getRow(rowIndex: Int): List<Int> {
    val triangle = ArrayList<ArrayList<Int>>()
    for (i in 0..rowIndex) {
        val row = ArrayList<Int>()
        for (j in 0..i) {
            if (j == 0 || j == i) {
                row.add(1)
            } else {
                row.add(triangle[i - 1][j - 1] + triangle[i - 1][j])
            }
        }
        triangle.add(row)
    }
    return triangle[rowIndex]
}

private fun getRowII(rowIndex: Int): List<Int> {
    val list: MutableList<Int> = ArrayList()
    if (rowIndex < 0) return list
    for (i in 0 until rowIndex + 1) {
        list.add(0,1)
        for (j in 1 until list.size - 1) {
            list[j] = list[j] + list[j + 1]
        }
    }
    return list
}


