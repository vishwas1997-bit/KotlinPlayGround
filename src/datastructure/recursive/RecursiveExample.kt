package datastructure.recursive

fun main(){
    val recursiveExample = RecursiveExample()
    recursiveExample.recursiveFun6(4)
//    println(recursiveExample.recursiveFun1(3))
}
// when n = 3 = 1 + recursiveFun1(2)
// when n = 2 = 1 + recursiveFun1(1)
// when n = 1 = 1 + recursiveFun1(0) -> 1

class RecursiveExample {
    fun recursiveFun1(n: Int): Int {
        return if (n <= 0){
            1
        } else{
            1 + recursiveFun1(n - 1)
        }
    }

    fun recursiveFun2(n: Int): Int {
        return if (n <= 0){
            1
        } else {
            1 + recursiveFun2(n - 5)
        }
    }

    fun recursiveFun3(n: Int): Int {
        return if (n <= 0) {
            1
        } else {
            1 + recursiveFun3(n / 5)
        }
    }

    fun recursiveFun4(n: Int, m: Int, o: Int) {
        if (n <= 0) {
//            print("%d, %d\n", m, o)
        } else {
            recursiveFun4(n - 1, m + 1, o)
            recursiveFun4(n - 1, m, o + 1)
        }
    }

    fun recursiveFun5(n: Int): Int {
        var i = 0
        while (i < n) {
            i += 2
        }
        return if (n <= 0) 1 else 1 + recursiveFun5(n - 5)
    }

    fun recursiveFun6(n : Int) : Int{
        return if(n == 0){
            0
        } else{
            println(n)
            recursiveFun6(n - 1)
        }
    }
}