package datastructure.array.leetcode

private fun main(){
    println(canCompleteCircuit(intArrayOf(1,2,3,4,5), intArrayOf(3,4,5,1,2)))
}

private fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    val n: Int = gas.size
    var total_surplus = 0
    var surplus = 0
    var start = 0

    for (i in 0 until n) {
        total_surplus += gas[i] - cost[i]
        surplus += gas[i] - cost[i]
        if (surplus < 0) {
            surplus = 0
            start = i + 1
        }
    }
    return if (total_surplus < 0) -1 else start
}