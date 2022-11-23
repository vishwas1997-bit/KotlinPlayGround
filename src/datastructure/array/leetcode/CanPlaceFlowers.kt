package datastructure.array.leetcode

private fun main(){
    println(canPlaceFlowers(intArrayOf(1,0,0,0,1), 1))
}

/**
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 * Input: flowerbed = [1,0,1,0,1], n = 2
 * Output: false
 */
private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var count = 0
    var i = 0
    while (i < flowerbed.size && count < n){
        if (flowerbed[i] == 0){
            val nextValue = if (i == flowerbed.size - 1){
                0
            } else{
                flowerbed[i + 1]
            }
            val preValue = if (i == 0){
                0
            } else{
                flowerbed[i - 1]
            }

            if (nextValue == 0 && preValue == 0){
                flowerbed[i] = 1
                count++
            }
        }
        i++
    }
    return n == count
}