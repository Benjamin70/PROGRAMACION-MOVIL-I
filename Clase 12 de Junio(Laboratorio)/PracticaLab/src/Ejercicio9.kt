// Clase renombrada como UsuarioUsr para evitar duplicados
class UsuarioUsr(val username: String, val email: String) {

    init {
        require(username.isNotBlank()) { "El nombre de usuario no puede estar vacío." }
    }

    // Constructor secundario que genera email automáticamente
    constructor(username: String) : this(
        username,
        "$username@empresa.com".also {
            require(it.contains("@")) { "El email generado no es válido: $it" }
        }
    )

    fun mostrarUsuarioUsr() {
        println("Usuario: $username - Email: $email")
    }
}

fun main() {
    val usuario1 = UsuarioUsr("juan", "juan@example.com")
    val usuario2 = UsuarioUsr("laura")

    usuario1.mostrarUsuarioUsr()
    usuario2.mostrarUsuarioUsr()
}
