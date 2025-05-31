// ============================
// 🟢 Ejercicio 4.8 – Clase Book y subclase eBook
// ============================

/*
📌 Explicación:
Este ejercicio trata de herencia básica y sobreescritura de métodos.

1. Se crea una clase `Book` con título y autor, y una variable `currentPage`.
2. El método `readPage()` aumenta `currentPage` en 1.
3. Se crea una subclase `eBook` que hereda de `Book`.
   - Añade un nuevo parámetro `format` (por defecto “texto”).
   - Sobrescribe `readPage()` para contar palabras (250 por página).

Ambas clases simulan la lectura de páginas, pero con una lógica diferente.
*/

fun main() {
    val physicalBook = Book("Cien Años de Soledad", "Gabriel García Márquez")
    println("Leyendo libro físico: ${physicalBook.title} de ${physicalBook.author}")
    repeat(3) { physicalBook.readPage() }

    val digitalBook = eBook("1984", "George Orwell")
    println("\nLeyendo eBook: ${digitalBook.title} de ${digitalBook.author} (Formato: ${digitalBook.format})")
    repeat(3) { digitalBook.readPage() }
}

// Clase base Book
open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("Página actual del libro: $currentPage")
    }
}

// Subclase eBook que sobreescribe el comportamiento de lectura
class eBook(title: String, author: String, val format: String = "texto") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
        println("Palabras leídas del eBook: $wordCount")
    }
}
