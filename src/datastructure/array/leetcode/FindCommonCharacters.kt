package datastructure.array.leetcode

private fun main(){
    println(commonChars(arrayOf("bella","label","roller")))
}

fun commonChars(A: Array<String>): List<String>{
    A.forEach { _ -> }

    val dic = IntArray(26)
    val ansList = mutableListOf<String>()
    for (i in 0 until A[0].length){
        dic[A[0][i] - 'a']++
    }

    for (i in 1 until A.size){
        val curr = IntArray(26)
        for (j in 0 until A[i].length){
            curr[A[i][j] - 'a']++
        }

        for (j in 0 until 26){
            if (curr[j] < dic[j]){
                dic[j] = curr[j]
            }
        }
    }

    for (i in 0 until 26){
        for (j in 0 until dic[i]){
            ansList.add(('a'.toInt() + i).toChar().toString())
        }
    }
    return ansList
}