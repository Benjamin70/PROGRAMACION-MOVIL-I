// ============================
// 🟢 Ejercicio 5.9 – Extensiones, mutabilidad y comportamiento externo a la clase
// ============================

/*
📌 Explicación:
1. Se extiende la clase Book agregando una propiedad mutable `pages`.
2. Se crean dos funciones de extensión:
   - `weight()` calcula el peso del libro (páginas * 1.5g).
   - `tornPages()` reduce el número de páginas al "romper" una cantidad.
3. Se crea una clase `Puppy` con el método `playWithBook()` que rompe páginas aleatoriamente.
4. Se ejecuta un bucle hasta que el libro se quede sin páginas.

Este ejercicio demuestra cómo usar funciones de extensión para añadir comportamiento sin modificar la clase original.
*/

import kotlin.random.Random

fun main() {
    val book = BookDestructible("El Principito", "Antoine de Saint-Exupéry", 1943, pages = 50)
    val puppy = Puppy()

    println("Páginas iniciales: ${book.pages}")
    println("Peso del libro: ${book.weight()} gramos")

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("El cachorro jugó. Páginas restantes: ${book.pages}")
    }

    println("¡El libro ha sido destruido por el cachorro!")
}

// 🐾 Clase renombrada para evitar conflicto con otras Book anteriores
class BookDestructible(val title: String, val author: String, val year: Int, var pages: Int)

// 🧠 Función de extensión para calcular el peso
fun BookDestructible.weight(): Double {
    return pages * 1.5
}

// ✂️ Función de extensión para romper páginas
fun BookDestructible.tornPages(pagesTorn: Int) {
    pages = if (pages - pagesTorn < 0) 0 else pages - pagesTorn
}

// 🐶 Clase Puppy que juega y rompe páginas
class Puppy {
    fun playWithBook(book: BookDestructible) {
        val torn = Random.nextInt(1, 10)
        book.tornPages(torn)
    }
}
