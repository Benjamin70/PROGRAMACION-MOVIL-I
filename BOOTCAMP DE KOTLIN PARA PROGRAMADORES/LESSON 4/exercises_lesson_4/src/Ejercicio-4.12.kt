// ============================
// 🟢 Ejercicio 4.12 – Clase de datos SpiceContainer
// ============================

/*
📌 Explicación:
Este ejercicio introduce el uso de clases de datos en Kotlin.
Se crea una clase `SpiceContainer` que almacena un objeto tipo especia.
La propiedad `label` se genera automáticamente a partir del nombre de la especia.

Se renombró la clase Spice a `SpiceData` para evitar conflicto con ejercicios anteriores.
*/

fun main() {
    val spice1 = SpiceData("Curry", "mild")
    val spice2 = SpiceData("Pepper", "hot")
    val spice3 = SpiceData("Ginger", "medium")

    val containers = listOf(
        SpiceContainer(spice1),
        SpiceContainer(spice2),
        SpiceContainer(spice3)
    )

    for (container in containers) {
        println("Etiqueta del contenedor: ${container.label}")
    }
}

// Clase de especia renombrada a SpiceData para evitar conflictos
data class SpiceData(val name: String, val spiciness: String)

// Clase de datos contenedora
data class SpiceContainer(val spice: SpiceData) {
    val label: String
        get() = spice.name
}
