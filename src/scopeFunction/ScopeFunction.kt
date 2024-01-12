package scopeFunction

private fun main() {
    runUseCase()
}

private fun letUseCase() {
    val output = Person().let { person ->
        person.name = "Vishwas"
        person.contactNumber = "13"
        person.address = "Uk"
        person.displayInfo()
        person.address
    }
    println("\n $output")
}

private fun runUseCase() {
    val output = Person().run {
        name = "Vishwas"
        contactNumber = "13"
        address = "Uk"
        displayInfo()
        name
    }
    println("\n $output")
}

private fun applyUseCase() {
    val output = Person().apply {
        name = "Vishwas"
        contactNumber = "13"
        address = "Uk"
        displayInfo()
    }
    println("\n ${output.contactNumber}")
}

private class Person {
    var name: String = "Abcd"
    var contactNumber: String = "1234567890"
    var address: String = "xyz"
    fun displayInfo() = print(
        "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    )

}