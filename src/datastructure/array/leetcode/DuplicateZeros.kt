package datastructure.array.leetcode

private fun main(){
    val output = duplicateZeros(intArrayOf(1,0,2,3,0,4,5,0))
    for (i in output) print("$i")
}

/**
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 */
private fun duplicateZeros(arr: IntArray) : IntArray{
    val n = arr.size
    var count = 0
    var i = arr.size - 1
    for (k in arr) if (k == 0) count += 1
    var write =  n + count - 1

    while (i >= 0 && write >= 0){
        if (arr[i] != 0){
            if(write < n){
                arr[write] = arr[i]
            }
        } else{
            if (write < n){
                arr[write] = arr[i]
            }
            write--
            if (write < n){
                arr[write] = arr[i]
            }
        }
        i--
        write--
    }
    return arr
}