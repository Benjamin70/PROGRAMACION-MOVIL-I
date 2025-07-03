// Función de extensión para verificar si un número es par
fun Int.esPar(): Boolean {
    return this % 2 == 0
}

// Función de extensión para obtener el cuadrado de un número
fun Int.cuadrado(): Int {
    return this * this
}

fun main() {
    val numeroPar = 10
    val numeroImpar = 5

    println("$numeroPar es par: ${numeroPar.esPar()}")
    println("$numeroPar al cuadrado: ${numeroPar.cuadrado()}")

    println("$numeroImpar es par: ${numeroImpar.esPar()}")
    println("$numeroImpar al cuadrado: ${numeroImpar.cuadrado()}")
}