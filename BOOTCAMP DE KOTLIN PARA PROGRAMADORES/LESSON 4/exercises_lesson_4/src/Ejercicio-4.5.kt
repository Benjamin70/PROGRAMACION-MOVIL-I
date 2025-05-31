// ============================
// 🟢 Ejercicio 4.10 – Spice, Curry, Grinder, Delegación y Color
// ============================

/*
📌 Este ejercicio implementa:
- Una clase abstracta `Spice` con un método abstracto `prepareSpice()`.
- Una subclase `Curry` que recibe `name` y `spiciness`, implementa `Grinder` y delega `SpiceColor`.
- Una interfaz `Grinder` con un método `grind()`.
- Una interfaz `SpiceColor` delegada en un singleton `YellowSpiceColor`.
*/

fun main() {
    val curry = Curry("Curry Amarillo", "hot")
    println("Nombre: ${curry.name}")
    println("Picante: ${curry.spiciness}")
    println("Color: ${curry.color}")
    curry.prepareSpice()
}

// Interfaz para definir el color de una especia
interface SpiceColor {
    val color: String
}

// Singleton que representa el color amarillo
object YellowSpiceColor : SpiceColor {
    override val color: String = "amarillo"
}

// Interfaz para especias que deben ser molidas
interface Grinder {
    fun grind()
}

// Clase abstracta Spice que delega la propiedad color
abstract class Spice(
    val name: String,
    val spiciness: String,
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

// Subclase concreta Curry que implementa Grinder
class Curry(
    name: String,
    spiciness: String
) : Spice(name, spiciness, YellowSpiceColor), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo el curry \"$name\" con nivel \"$spiciness\".")
    }
}
