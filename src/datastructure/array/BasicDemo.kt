package datastructure.array

fun main(){
    val array = intArrayOf(1,2,3,4,5,6,7)
    println(array.indices)
    println(array.size)

    for (i in array.indices){
        print("${array[i]} \t")
    }
    println()

    for (i in array.indices){
        print("${array[i]} \t")
    }

    array.forEach { i -> print("${array[i]} \t")}
}
