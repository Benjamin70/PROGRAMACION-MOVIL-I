// ============================
// 🟢 Ejercicio 5.5 – Sets, Mapas y funciones any() y getOrPut()
// ============================

/*
📌 Explicación:
Este ejercicio trabaja con colecciones como Set, Map y MutableMap, aplicando funciones
de orden superior como `any()` y `getOrPut()` para verificar y agregar elementos.

- Se crea un Set con libros de Shakespeare.
- Luego se crea un Map (library) asociando ese conjunto a su autor.
- Se verifica si "Hamlet" está en los libros usando `any()`.
- Se crea un MutableMap y se usa `getOrPut()` para buscar o agregar un título nuevo.
*/

fun main() {
    // Conjunto de libros
    val allBooks = setOf("Romeo and Juliet", "Hamlet", "Macbeth", "Othello")

    // Mapa de autor a sus libros
    val library = mapOf("William Shakespeare" to allBooks)

    // Verificar si algún libro es "Hamlet"
    println("¿Contiene 'Hamlet'?: ${library.any { it.value.contains("Hamlet") }}")

    // Mutable map con libros adicionales
    val moreBooks = mutableMapOf("Cien Años de Soledad" to "Gabriel García Márquez")

    // Uso de getOrPut
    val author = moreBooks.getOrPut("Don Quijote") { "Miguel de Cervantes" }
    println("Autor encontrado o agregado: $author")

    println("Catálogo actualizado: $moreBooks")
}
