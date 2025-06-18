// Clase base
open class FiguraGeometrica(val nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: $nombre")
    }
}

// Clase hija Circulo
class Circulo(nombre: String, val radio: Double) : FiguraGeometrica(nombre)

// Clase hija Cuadrado
class Cuadrado(nombre: String, val lado: Double) : FiguraGeometrica(nombre)

fun main() {
    val miCirculo = Circulo("Círculo", 5.0)
    val miCuadrado = Cuadrado("Cuadrado", 4.0)

    miCirculo.imprimirNombre()
    miCuadrado.imprimirNombre()
}
