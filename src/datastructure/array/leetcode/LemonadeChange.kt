package datastructure.array.leetcode

/**
Input: bills = [5,5,5,10,20]
Output: true
Explanation:
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.

Input: bills = [5,5,10,10,20]
Output: false
Explanation:
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can not give the change of $15 back because we only have two $10 bills.
Since not every customer received the correct change, the answer is false.
 */
private fun main(){
    println(lemonadeChange(intArrayOf(5,5,5,5,20,20,5,5,20,5)))
}

private fun lemonadeChange(bills: IntArray): Boolean {
    var fiveDollorChange = 0
    var tenDollorChange = 0
    for (i in bills){
        val change = i - 5
        if (change == 0){
            fiveDollorChange++
            continue
        }

        if (change == 5 && fiveDollorChange > 0){
            fiveDollorChange--
            tenDollorChange++
        } else if (change == 15 ){
            if (fiveDollorChange > 0 && tenDollorChange > 0){
                fiveDollorChange--
                tenDollorChange--
            } else if (fiveDollorChange * 5 >= 15){
                fiveDollorChange -= 3
            } else{
                return false
            }

        } else{
            return false
        }
    }
    return true
}