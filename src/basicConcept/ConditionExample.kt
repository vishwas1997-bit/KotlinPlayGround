package basicConcept

private fun main() {
    checkList()

    println("abcdefghijk".substring(0, 6))
}

private fun checkList() {
    val list_1 = ArrayList<Int>()
    list_1.add(1)
    list_1.add(2)
    list_1.add(3)

    val list_2 = ArrayList<Int>()
    list_2.addAll(list_1)
    list_2.add(4)

    println("List 1 : " + list_1.hashCode())
    println("List 2 : " + list_2.hashCode())


}