data class Libro(val titulo: String, val autor: String, val isbn: String)

fun main() {
    val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0")
    val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0")

    // Comparar las dos instancias
    println(libro1 == libro2)  // true

    // Imprimir una instancia (usa toString() autogenerado)
    println(libro1)

    // Crear una tercera instancia copiando libro1 pero cambiando el título
    val libro3 = libro1.copy(titulo = "El amor en los tiempos del cólera")
    println(libro3)
}