// ============================
// 🟢 Ejercicio 4.10 – Clases abstractas, interfaces y delegación
// ============================

/*
📌 Explicación:
Este ejercicio aplica conceptos clave de programación orientada a objetos:
- Clases abstractas (`Spice`)
- Interfaces (`Grinder`, `SpiceColor`)
- Delegación de interfaz (como en el ejemplo de `Plecostomus`)
- Subclases como `Curry`, que heredan e implementan comportamiento específico

El curry hereda de `Spice`, implementa `Grinder`, y delega `SpiceColor` a una instancia singleton `YellowSpiceColor`.
*/

fun main() {
    val curry = Curry("Curry Rojo", "hot")
    println("La especia ${curry.name} tiene color: ${curry.color}")
    curry.prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "amarillo"
}

abstract class Spice(
    val name: String,
    val spiciness: String,
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String) :
    Spice(name, spiciness, YellowSpiceColor), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo la especia \"$name\" con picor \"$spiciness\".")
    }
}

