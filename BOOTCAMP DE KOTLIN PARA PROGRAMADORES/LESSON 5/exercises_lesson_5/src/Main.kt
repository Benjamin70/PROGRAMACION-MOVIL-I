// ============================
// 🟢 Ejercicio 5.3 – Uso de Pair y Triple en una clase Book
// ============================

/*
📌 Explicación:
Creamos una clase Book con propiedades título, autor y año de publicación.
Se implementan dos métodos:
- Uno que devuelve un Pair con el título y autor.
- Otro que devuelve un Triple con título, autor y año.

Luego, creamos una instancia del libro e imprimimos esa información en una oración descriptiva.
*/

fun main() {
    val myBook = Book("Cien Años de Soledad", "Gabriel García Márquez", 1967)

    val (title, author) = myBook.getTitleAndAuthor()
    val (t, a, y) = myBook.getBookDetails()

    println("Aquí está tu libro \"$title\" escrito por $author.")
    println("Aquí está tu libro \"$t\" escrito por $a en $y.")
}

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getBookDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
