package BasicConcept

import javax.xml.bind.JAXBElement.GlobalScope

private fun main(){
    val obj1 = SealedClassSample.B()
    obj1.print()

    val obj2 = SealedClassSample.A()
    obj2.print()
}

private sealed class SealedClassSample {
    class A : SealedClassSample() {
        fun print()
        {
            println("This is the subclass A of sealed class Sample")
        }
    }
    class B : SealedClassSample() {
        fun print()
        {
            println("This is the subclass B of sealed class Sample")
        }
    }
}