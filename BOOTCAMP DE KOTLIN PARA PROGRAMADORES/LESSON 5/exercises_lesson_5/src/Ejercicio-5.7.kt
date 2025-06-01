// ============================
// 🟢 Ejercicio 5.7 – Constantes, companion object y validaciones
// ============================

/*
📌 Explicación:
1. Se define una constante global `MAX_BORROWED_BOOKS`.
2. Se usa un `object` llamado `Constants` para contener constantes globales como una base de URL general.
3. Se define la clase `BookConstants` (renombrada para evitar conflicto con otras clases `Book`).
4. Se implementa un método `canBorrow()` que indica si un usuario puede seguir tomando libros prestados.
5. Se usa un `companion object` dentro de la clase para definir la constante específica `BASE_URL`.
6. Se imprime una URL generada automáticamente basada en el título del libro.

📌 Nota:
La clase se renombró de `Book` a `BookConstants` para evitar error de redeclaración con ejercicios anteriores.
*/

// Constante de nivel superior (global)
const val MAX_BORROWED_BOOKS = 3

// Objeto de constantes globales
object Constants {
    const val GLOBAL_BASE_URL = "https://library.example.com/"
}

fun main() {
    val myBook = BookConstants("Clean Code", "Robert C. Martin", 2008)

    println("¿Puede tomar más libros prestados (usuario tiene 2)? ${myBook.canBorrow(2)}")
    println("¿Puede tomar más libros prestados (usuario tiene 3)? ${myBook.canBorrow(3)}")

    myBook.printUrl()
}

// 🔁 Renombrada para evitar conflicto con clase Book ya existente
class BookConstants(val title: String, val author: String, val year: Int) {

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        println("URL del libro: ${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        const val BASE_URL = "https://librarycatalog.com/books/"
    }
}
