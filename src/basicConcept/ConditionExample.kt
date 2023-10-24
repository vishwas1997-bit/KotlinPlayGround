package basicConcept

fun main() {
//    val a = 2
//    val b = 4
//    val validNumbers = 5 downTo 0
//    val max = if (a < b) a else b
//    println(max)
//
//    when (15) {
//        in 1..10 -> print("x is in the range")
//        in validNumbers -> print("x is valid")
//        !in 10..20 -> print("x is outside the range")
//        else -> print("none of the above")
//    }

    checkList()
}

private fun checkList(){
    val list_1 = ArrayList<Int>()
    list_1.add(1)
    list_1.add(2)
    list_1.add(3)

    val list_2 = ArrayList<Int>()
    list_2.addAll(list_1)
    list_2.add(4)

    println("List 1 : "+list_1.hashCode())
    println("List 2 : "+list_2.hashCode())


}