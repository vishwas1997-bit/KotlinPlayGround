package datastructure.string.leetcode

private fun main() {
    val s = "babad"
    val length = longestPalSubstr(s)
    println("Length: $length")
}

// Function to print a substring str[low..high]
private fun printSubStr(str: String, low: Int, high: Int) {
    for (i in low..high) print(str[i])
    println()
}

// Function to find the longest palindromic substring
private fun longestPalSubstr(s: String): Int {
    val n = s.length
    var start = 0
    var end = 1
    var low: Int
    var hi: Int

    // Traverse the input string
    for (i in 0 until n) {

        // Find longest palindromic substring of even size
        low = i - 1
        hi = i

        // Expand substring while it is palindrome and in bounds
        while (low >= 0 && hi < n && s[low] == s[hi]) {

            // Update maximum length and starting index
            if (hi - low + 1 > end) {
                start = low
                end = hi - low + 1
            }
            low--
            hi++
        }

        // Find longest palindromic substring of odd size
        low = i - 1
        hi = i + 1

        // Expand substring while it is palindrome and in bounds
        while (low >= 0 && hi < n && s[low] == s[hi]) {

            // Update maximum length and starting index
            if (hi - low + 1 > end) {
                start = low
                end = hi - low + 1
            }
            low--
            hi++
        }
    }

    // Print the longest palindromic substring
    print("Longest palindrome substring is: ")
    printSubStr(s, start, start + end - 1)

    // Return output length
    return end
}
