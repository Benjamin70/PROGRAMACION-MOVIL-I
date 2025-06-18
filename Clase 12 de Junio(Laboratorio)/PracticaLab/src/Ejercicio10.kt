// Clase base renombrada para evitar conflictos
open class NotificacionNotif {
    open fun enviarNotif() {
        println("Enviando notificación genérica...")
    }
}

// Clase hija Email
class NotificacionEmailNotif(val destinatario: String, val asunto: String) : NotificacionNotif() {
    override fun enviarNotif() {
        println("Enviando email a $destinatario con asunto: \"$asunto\"")
    }
}

// Clase hija SMS
class NotificacionSMSNotif(val numero: String, val mensaje: String) : NotificacionNotif() {
    override fun enviarNotif() {
        println("Enviando SMS al $numero con mensaje: \"$mensaje\"")
    }
}

// Clase hija Push
class NotificacionPushNotif(val dispositivoId: String, val contenido: String) : NotificacionNotif() {
    override fun enviarNotif() {
        println("Enviando notificación push a dispositivo $dispositivoId con contenido: \"$contenido\"")
    }
}

// Función para enviar todas las notificaciones
fun enviarTodasNotif(notificaciones: List<NotificacionNotif>) {
    for (notificacion in notificaciones) {
        notificacion.enviarNotif()
    }
}

fun main() {
    val email = NotificacionEmailNotif("ana@correo.com", "Bienvenida")
    val sms = NotificacionSMSNotif("8291234567", "Tu código es 1234")
    val push = NotificacionPushNotif("device-001", "Tienes una nueva alerta")

    val listaNotificaciones = listOf<NotificacionNotif>(email, sms, push)

    enviarTodasNotif(listaNotificaciones)
}
