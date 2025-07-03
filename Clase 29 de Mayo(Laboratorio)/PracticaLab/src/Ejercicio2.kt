sealed class ResultadoAPI {
    data class Exito(val datos: String) : ResultadoAPI()
    data class Error(val mensaje: String) : ResultadoAPI()
    object Cargando : ResultadoAPI()
}

fun procesarResultado(resultado: ResultadoAPI) {
    when (resultado) {
        is ResultadoAPI.Exito -> println("Éxito con datos: ${resultado.datos}")
        is ResultadoAPI.Error -> println("Error: ${resultado.mensaje}")
        ResultadoAPI.Cargando -> println("Cargando...")
    }
}

fun main() {
    val exito = ResultadoAPI.Exito("Datos recibidos correctamente")
    val error = ResultadoAPI.Error("No se pudo conectar al servidor")
    val cargando = ResultadoAPI.Cargando

    procesarResultado(exito)
    procesarResultado(error)
    procesarResultado(cargando)
}