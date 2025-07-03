// Función que devuelve coordenadas como Pair
fun obtenerCoordenadas(): Pair<Int, Int> {
    return Pair(42, 78)
}

// Función que devuelve datos de usuario como Triple
fun obtenerDatosUsuario(): Triple<String, Int, Boolean> {
    return Triple("Laura", 29, true)
}

fun main() {
    // Desestructuración del Pair
    val (x, y) = obtenerCoordenadas()
    println("Coordenadas: X = $x, Y = $y")

    // Desestructuración del Triple
    val (nombre, edad, estaActivo) = obtenerDatosUsuario()
    println("Usuario: $nombre, Edad: $edad, Activo: ${if (estaActivo) "Sí" else "No"}")
}