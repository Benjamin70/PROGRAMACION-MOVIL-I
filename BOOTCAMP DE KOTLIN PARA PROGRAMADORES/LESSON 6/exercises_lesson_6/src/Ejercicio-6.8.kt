// Ejercicio-6.8.kt

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

// 🔄 Renombramos la clase para evitar conflicto con otra clase Game existente.
// Esto es útil si estamos haciendo todos los ejercicios en un mismo proyecto.
class Game_6_8 {
    private var path = mutableListOf(Direction.START)

    private val north: () -> Unit = { path.add(Direction.NORTH) }
    private val south: () -> Unit = { path.add(Direction.SOUTH) }
    private val east: () -> Unit  = { path.add(Direction.EAST) }
    private val west: () -> Unit  = { path.add(Direction.WEST) }

    private val end: () -> Unit = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
    }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game_6_8() // ⬅️ Instancia corregida según nuevo nombre

    while (true) {
        print("Enter a direction (n/s/e/w, otra para terminar): ")
        val input = readLine()
        game.makeMove(input)
    }
}
