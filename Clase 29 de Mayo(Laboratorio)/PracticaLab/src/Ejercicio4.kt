object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
        println(mensaje)
    }

    fun mostrarLogs() {
        println("\nHistorial de logs:")
        for (mensaje in logs) {
            println(mensaje)
        }
    }
}

fun main() {
    Logger.log("Inicio de la aplicación")
    Logger.log("Usuario se ha logueado")
    Logger.log("Error: no se pudo cargar el perfil")
    // Mostrar todos los logs al final
    Logger.mostrarLogs()
}