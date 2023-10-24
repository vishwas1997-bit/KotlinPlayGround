package basicConcept

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

private fun main()  {
    val obj = FlowDemo()
    runBlocking {
        println("Calling simple function...")
        val flow = obj.simple()
        println("Calling collect...")
        flow.collectLatest { value -> println(value) }
    }
    obj.abc()
}

private class FlowDemo{
    fun simple(): Flow<Int> = flow {
        println("Flow started")
        for (i in 1..3) {
            delay(2500)
            emit(i)
        }
    }

    fun abc(){
        println("Suspend function")
    }


}