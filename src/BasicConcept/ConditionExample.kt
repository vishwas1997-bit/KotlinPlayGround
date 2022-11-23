package BasicConcept

fun main() {
    val a = 2
    val b = 4
    val validNumbers = 5 downTo 0
    val max = if (a < b) a else b
    println(max)

    when (15) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}