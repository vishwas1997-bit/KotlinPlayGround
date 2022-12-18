package datastructure.array.leetcode

private fun main(){
    println(
        numUniqueEmails(arrayOf("a@leetcode.com","b@leetcode.com","c@leetcode.com"))
    )
}

/**
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
"testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
 */
private fun numUniqueEmails(emails: Array<String>): Int {
    val hashtable = HashMap<String,String>()
    emails.forEach {
        if (it.contains("+")){
            val plusIndex = it.indexOf("+")
            val localAddress =  it.substring(0,plusIndex).replace(".","")
            val index = it.indexOf("@")
            val completeAdd = localAddress+it.substring(index,it.length)
            hashtable[completeAdd] = it
        } else{
            hashtable[it] = it
        }
    }
    return hashtable.size
}