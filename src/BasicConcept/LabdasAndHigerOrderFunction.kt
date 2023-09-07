package BasicConcept

private fun main(){
    println(hola { "Hola, Higher Order function" })
}

private fun hola(abc: () -> String) : String{
    return abc()
}