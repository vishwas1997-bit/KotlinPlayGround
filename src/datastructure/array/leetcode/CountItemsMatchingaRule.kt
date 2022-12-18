package datastructure.array.leetcode

private fun main() {
    println(
        countMatches(
            listOf(
                listOf("phone", "blue", "pixel"),
                listOf("computer", "silver", "lenovo"),
                listOf("phone", "gold", "iphone")
            ), "type", "phone"
        )
    )
}

/**
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */
private fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0
    for (i in items.indices) {
        when (ruleKey) {
            "type" -> {
                if (ruleValue == items[i][0]) {
                    count++
                }
            }

            "color" -> {
                if (ruleValue == items[i][1]) {
                    count++
                }
            }

            "name" -> {
                if (ruleValue == items[i][2]) {
                    count++
                }
            }
        }
    }
    return count
}