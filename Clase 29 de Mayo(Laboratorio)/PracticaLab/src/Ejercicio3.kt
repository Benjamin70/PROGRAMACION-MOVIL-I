enum class PrioridadTarea(val colorHex: String) {
    BAJA("#00FF00"),
    MEDIA("#FFFF00"),
    ALTA("#FF0000")
}

fun obtenerColor(prioridad: PrioridadTarea): String {
    return prioridad.colorHex
}

fun main() {
    for (prioridad in PrioridadTarea.values()) {
        println("${prioridad.name} tiene el color ${obtenerColor(prioridad)}")
    }
}