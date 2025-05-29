// ---------------------------------------------------------
// 🟢 Ejercicio 3.17 - Filtrado de Especias (ACTIVO)
// ---------------------------------------------------------
fun main() {
    val spices = listOf(
        "curry", "pepper", "cayenne", "ginger",
        "red curry", "green curry", "red pepper"
    )

    // 1. Obtener todos los curries y ordenarlos por longitud
    val curriesSorted = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }
    println("Curries ordenados por longitud: $curriesSorted")

    // 2. Filtrar las que empiezan por "c" y terminan en "e"
    val cAndE = spices
        .filter { it.startsWith("c") && it.endsWith("e") }
    println("Empiezan con 'c' y terminan con 'e': $cAndE")

    // 3. Tomar los primeros tres y devolver los que comienzan con 'c'
    val firstThreeWithC = spices
        .take(3)
        .filter { it.startsWith("c") }
    println("Primeros tres que empiezan con 'c': $firstThreeWithC")
}
