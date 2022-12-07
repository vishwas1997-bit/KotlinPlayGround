package datastructure.array.leetcode

private fun main() {
    val output = findRestaurant(
        arrayOf("happy", "sad", "good"),
        arrayOf("sad", "happy", "good")
    )
    for (txt in output) {
        print(txt + "\t")
    }
}

/**
 * Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only common string is "Shogun".
 *
 * Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
 * Output: ["Shogun"]
 * Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
 *
 *
 * Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
 * Output: ["sad","happy"]
 * Explanation: There are three common strings:
 * "happy" with index sum = (0 + 1) = 1.
 * "sad" with index sum = (1 + 0) = 1.
 * "good" with index sum = (2 + 2) = 4.
 * The strings with the least index sum are "sad" and "happy".
 */
private fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    var sum = Int.MAX_VALUE
    val ansList = mutableListOf<String>()
    for (i in list1.indices) {
        if (list2.contains(list1[i])) {
            val currentSum = i + list2.indexOf(list1[i])
            if (currentSum < sum) {
                sum = currentSum
                ansList.clear()
                ansList.add(list1[i])
            } else if (currentSum == sum) {
                ansList.add(list1[i])
            }
        }
    }
    return ansList.toTypedArray()
}