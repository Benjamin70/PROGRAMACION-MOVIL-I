// Clase genérica con tipo nullable
class Caja<T>(private val contenido: T?) {

    fun obtenerContenido(): T? {
        return contenido
    }

    fun estaVacia(): Boolean {
        return contenido == null
    }
}

fun main() {
    val cajaDeTexto = Caja("Hola Mundo")
    val cajaDeNumero = Caja(42)
    val cajaVacia = Caja<String?>(null)

    println("Contenido de cajaDeTexto: ${cajaDeTexto.obtenerContenido()}")
    println("¿cajaDeTexto está vacía? ${cajaDeTexto.estaVacia()}")

    println("Contenido de cajaDeNumero: ${cajaDeNumero.obtenerContenido()}")
    println("¿cajaDeNumero está vacía? ${cajaDeNumero.estaVacia()}")

    println("Contenido de cajaVacia: ${cajaVacia.obtenerContenido()}")
    println("¿cajaVacia está vacía? ${cajaVacia.estaVacia()}")
}