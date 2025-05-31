// ============================
// 🟢 Ejercicio 4.3 – Clase SimpleSpice
// ============================

fun main() {
    val spice = SimpleSpice()
    println("Nombre: ${spice.name}")
    println("Heat: ${spice.heat}")
}

// Clase que representa una especia con nombre, nivel de picante, y valor numérico (heat)
class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0
        }
}
