// Clase renombrada para evitar conflictos con otros ejercicios
class ProductoValidado(val codigo: String, val precio: Double) {

    init {
        if (precio < 0.0) {
            throw IllegalArgumentException("El precio no puede ser negativo: $precio")
        }
    }

    // Constructor secundario que asigna un precio por defecto
    constructor(codigo: String) : this(codigo, 9.99)

    // Constructor secundario sin parámetros
    constructor() : this("GEN-001", 0.99)

    fun mostrarDetallesProducto() {
        println("Código: $codigo - Precio: $precio")
    }
}

fun main() {
    val producto1 = ProductoValidado("P001", 25.0)
    val producto2 = ProductoValidado("P002")     // Usa el precio por defecto 9.99
    val producto3 = ProductoValidado()           // Usa GEN-001 y 0.99

    producto1.mostrarDetallesProducto()
    producto2.mostrarDetallesProducto()
    producto3.mostrarDetallesProducto()
}
