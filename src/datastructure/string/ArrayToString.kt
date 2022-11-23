package datastructure.string

fun main(){
    val obj = ArrayToString()
}
class ArrayToString {

    init {
        val firstValue = "vishwas"
        val secondValue = "Vishwas"
        if (firstValue.capitalize() == secondValue){
            println(true)
        } else{
            println(false)
        }

        println(firstValue.chunkedSequence(2))
    }
}