package basicConcept.annotation

private fun main(){
    val obj = Person()

}
@GenerateToString
class Person {
    private val name: String? = null
    private val age = 0 // Constructors, getters, setters, etc.
}