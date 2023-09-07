package datastructure.array.leetcode

import java.util.*
import kotlin.math.max


private fun main(){
    val output = merge(arrayOf(intArrayOf(1,3), intArrayOf(2,6),
        intArrayOf(8,10), intArrayOf(15,18)
    ))
    for (i in output){
        for (j in i){
            print("$j\t")
        }
        println()
    }
}

private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    if (intervals.size <= 1) return intervals

    Arrays.sort<IntArray>(intervals) { i1: IntArray, i2: IntArray -> i1[1].compareTo(i2[0]) }

    val result: MutableList<IntArray> = ArrayList()
    var newInterval = intervals[0]
    result.add(newInterval)
    for (interval in intervals) {
        if (interval[0] <= newInterval[1]){
            newInterval[1] = max(newInterval[1], interval[1])
        } else {
            newInterval = interval
            result.add(newInterval)
        }
    }

    return result.toTypedArray()
}