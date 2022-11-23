package datastructure.array

fun main() {
    val array = arrayOf(1,2,3,4,5,6,7)
    for (i in array.indices){
        print("${array[i]}\t")
    }
    array.reverse()
    println()
    for (i in array.indices){
        print("${array[i]}\t")
    }
}