// ============================
// 🟢 Ejercicio 4.14 – Enum, sealed class y uso en SpiceColor
// ============================

/*
📌 Explicación:
1. Se crea una enumeración `ColorEnum` que define colores RGB.
2. Se cambia el tipo de `color` en `SpiceColorEnumBase` para usar el enum `ColorEnum` en vez de `String`.
3. Se actualiza el objeto singleton `YellowSpiceColorEnumBase` para usar el color `YELLOW`.
4. Se hace que la clase `SpiceBaseSealed` sea `sealed`, lo que significa que solo puede tener subclases dentro del mismo archivo.

📌 ¿Por qué es útil una clase sellada (sealed class)?
- Permite representar un conjunto restringido de tipos.
- Es útil para usar con `when`, ya que el compilador sabe todos los posibles subtipos.
- Es más segura que una clase abierta (`open`) para jerarquías controladas.
*/

fun main() {
    val curry = CurrySealed("Curry Especial", "hot")
    println("Nombre: ${curry.name}")
    println("Picante: ${curry.spiciness}")
    println("Color: ${curry.color}")
    curry.prepareSpice()
}

// Enum de colores con valores RGB
enum class ColorEnum(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

// Interfaz SpiceColor renombrada para este ejercicio y con enum
interface SpiceColorEnumBase {
    val color: ColorEnum
}

// Singleton que devuelve el color amarillo usando enum
object YellowSpiceColorEnumBase : SpiceColorEnumBase {
    override val color = ColorEnum.YELLOW
}

// Interfaz Grinder renombrada para compatibilidad
interface GrinderEnumBase {
    fun grind()
}

// Clase Spice renombrada y sellada
sealed class SpiceBaseSealed(
    val name: String,
    val spiciness: String,
    color: SpiceColorEnumBase
) : SpiceColorEnumBase by color {
    abstract fun prepareSpice()
}

// Subclase concreta que hereda de la clase sellada y aplica interfaces
class CurrySealed(
    name: String,
    spiciness: String
) : SpiceBaseSealed(name, spiciness, YellowSpiceColorEnumBase), GrinderEnumBase {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo \"$name\" con picante \"$spiciness\"...")
    }
}
