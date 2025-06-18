// Clase base renombrada para evitar conflictos
open class PublicacionPub(val titulo: String, val autor: String)

// Clase hija Libro
class LibroPub(titulo: String, autor: String, val numeroPaginas: Int)
    : PublicacionPub(titulo, autor)

// Clase hija ArticuloDeRevista
class ArticuloDeRevistaPub(titulo: String, autor: String, val nombreRevista: String)
    : PublicacionPub(titulo, autor)

fun main() {
    val libro = LibroPub("1984", "George Orwell", 328)
    val articulo = ArticuloDeRevistaPub("La energía solar", "Ana Pérez", "Ciencia Hoy")

    println("Libro: ${libro.titulo} por ${libro.autor}, ${libro.numeroPaginas} páginas.")
    println("Artículo: ${articulo.titulo} por ${articulo.autor}, publicado en ${articulo.nombreRevista}.")
}
