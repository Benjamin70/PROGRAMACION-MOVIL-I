// ============================
// 🟢 Ejercicio 4.10 – Versión con renombramientos para evitar errores de redeclaración
// ============================

/*
📌 NOTA GENERAL:
Se renombraron todas las clases, interfaces y objetos para evitar conflictos con ejercicios anteriores:
- class Curry → CurrySpice
- abstract class Spice → SpiceBase
- interface Grinder → GrinderBase
- interface SpiceColor → SpiceColorBase
- object YellowSpiceColor → YellowSpiceColorBase

Esto permite compilar y ejecutar este archivo sin errores aunque existan clases del mismo nombre en Ejercicio-4.5.kt o 4.8.kt.
*/

fun main() {
    val curry = CurrySpice("Curry Amarillo", "hot")
    println("Nombre: ${curry.name}")
    println("Picante: ${curry.spiciness}")
    println("Color: ${curry.color}")
    curry.prepareSpice()
}

// Interfaz SpiceColor renombrada para evitar conflicto
interface SpiceColorBase {
    val color: String
}

// Singleton YellowSpiceColor renombrado para evitar conflicto
object YellowSpiceColorBase : SpiceColorBase {
    override val color: String = "amarillo"
}

// Interfaz Grinder renombrada para evitar conflicto
interface GrinderBase {
    fun grind()
}

// Clase abstracta Spice renombrada a SpiceBase para evitar conflicto
abstract class SpiceBase(
    val name: String,
    val spiciness: String,
    color: SpiceColorBase
) : SpiceColorBase by color {
    abstract fun prepareSpice()
}

// Subclase Curry renombrada a CurrySpice para evitar conflicto
class CurrySpice(
    name: String,
    spiciness: String
) : SpiceBase(name, spiciness, YellowSpiceColorBase), GrinderBase {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo la especia \"$name\" con nivel \"$spiciness\".")
    }
}
