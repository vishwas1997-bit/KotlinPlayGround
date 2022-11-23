package datastructure.array.leetcode

import java.util.*

fun main(){

    val scan = Scanner(System.`in`)
    print("Enter the Size of an Array : ")
    val inputArray = IntArray(scan.nextInt())
    for (i in inputArray.indices){
        inputArray[i] = scan.nextInt()
    }

    println("Input Array : ")
    for (i in inputArray.indices){
        println(inputArray[i])
    }

    println()

    val outputArray = getDay(inputArray)
    println("Output Array : ")
    for (i in outputArray.indices){
        println(outputArray[i])
    }
}

// input Array : [34, 43, 1, 23]
// output Array : [1,0,1,0]
fun getDay(temperature : IntArray) : IntArray{
    val outputArray = IntArray(temperature.size) // c constant time
    for (index in temperature.indices){  // n numbers
        for (i in temperature.indices){ // n numbers
            if (temperature[index] < temperature[i]){ // c constant time
                outputArray[index] = i // c constant time
                break
            } else{
                if (i == temperature.size-1){
                    outputArray[index] = 0
                }
            }
        }
    }

    // output Array :[]
    return outputArray
}