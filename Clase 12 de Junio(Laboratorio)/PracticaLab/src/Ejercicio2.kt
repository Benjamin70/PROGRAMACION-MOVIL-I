import kotlin.math.PI

// Clase base renombrada para evitar conflicto con otros archivos
open class FiguraGeometricaPoli(val nombre: String) {
    open fun calcularAreaPoli(): Double {  // Método renombrado
        return 0.0
    }

    fun imprimirNombrePoli() {  // Método renombrado
        println("Soy una figura: $nombre")
    }
}

// Clase hija Circulo renombrada
class CirculoPoli(nombre: String, val radio: Double) : FiguraGeometricaPoli(nombre) {
    override fun calcularAreaPoli(): Double {
        return PI * radio * radio
    }
}

// Clase hija Cuadrado renombrada
class CuadradoPoli(nombre: String, val lado: Double) : FiguraGeometricaPoli(nombre) {
    override fun calcularAreaPoli(): Double {
        return lado * lado
    }
}

fun main() {
    val miCirculo = CirculoPoli("Círculo", 5.0)
    val miCuadrado = CuadradoPoli("Cuadrado", 4.0)

    val figuras: List<FiguraGeometricaPoli> = listOf(miCirculo, miCuadrado)

    for (figura in figuras) {
        figura.imprimirNombrePoli()
        println("Área: ${figura.calcularAreaPoli()}")
        println()
    }
}
