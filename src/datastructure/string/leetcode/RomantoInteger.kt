package datastructure.string.leetcode


private fun main(){
    println(romanToInt2("CMXC"))
}

private fun romanToInt(s: String): Int {
    var ans = 0
    var num = 0
    for (i in s.length - 1 downTo 0) {
        when (s[i]) {
            'I' -> num = 1
            'V' -> num = 5
            'X' -> num = 10
            'L' -> num = 50
            'C' -> num = 100
            'D' -> num = 500
            'M' -> num = 1000
        }
        if (num < ans) {
            ans -= num
        } else {
            ans += num
        }
    }
    return ans
}

private fun romanToInt2(s: String): Int {
    if (s.isEmpty()) return -1
    val map = HashMap<Char, Int>()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000
    val len = s.length
    var result = map[s[len - 1]]!!
    for (i in len - 2 downTo 0) {
        if (map[s[i]]!! >= map[s[i + 1]]!!){
            result += map[s[i]]!!
        } else {
            result -= map[s[i]]!!
        }
    }
    return result
}