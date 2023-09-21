package datastructure.string.leetcode


private fun main(){
    val output = diffWaysToCompute("2-1-1")
    for (i in output){
        println(i)
    }
}

fun diffWaysToCompute(input: String): List<Int> {
    val res: MutableList<Int> = ArrayList()
    for (i in 0 until input.length) {
        val c = input[i]
        if (c == '-' || c == '+' || c == '*') {
            val a = input.substring(0, i)
            val b = input.substring(i + 1)
            val al = diffWaysToCompute(a)
            val bl = diffWaysToCompute(b)
            for (x in al) {
                for (y in bl) {
                    when (c) {
                        '-' -> {
                            res.add(x - y)
                        }
                        '+' -> {
                            res.add(x + y)
                        }
                        '*' -> {
                            res.add(x * y)
                        }
                    }
                }
            }
        }
    }
    if (res.size == 0) res.add(Integer.valueOf(input))
    return res
}