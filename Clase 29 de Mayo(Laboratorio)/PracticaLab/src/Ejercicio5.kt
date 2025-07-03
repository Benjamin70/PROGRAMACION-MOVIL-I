class Usuario private constructor(val email: String) {

    companion object {
        fun crearDesdeEmail(email: String): Usuario? {
            return if ("@" in email) {
                Usuario(email)
            } else {
                null
            }
        }
    }

    override fun toString(): String {
        return "Usuario(email='$email')"
    }
}

fun main() {
    val usuarioValido = Usuario.crearDesdeEmail("juan@example.com")
    val usuarioInvalido = Usuario.crearDesdeEmail("juan.example.com")

    if (usuarioValido != null) {
        println("Usuario válido creado: $usuarioValido")
    } else {
        println("Email inválido para usuario válido")
    }

    if (usuarioInvalido != null) {
        println("Usuario inválido creado: $usuarioInvalido")
    } else {
        println("Email inválido para usuario inválido")
    }
}