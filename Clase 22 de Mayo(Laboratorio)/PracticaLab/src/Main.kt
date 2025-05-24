//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ejercicio 1: Comprobador 👶👴 de edad simple
    var edad = 15
    if(edad >= 18){
        println("La persona es mayor de edad")
    }
    else{
        println("La persona es menor de edad")
    }
    //Ejercicio 2: Evaluador 🎓 de calificaciones
    var Calificacion = 50
    if(Calificacion >= 90 && Calificacion <= 100){
        println("Tiene A")
    }else if(Calificacion >= 80 && Calificacion <= 89){
        println("Tiene B")
    }else if(Calificacion >= 70 && Calificacion <= 79){
        println("Tiene C")
    }else if(Calificacion >= 60 && Calificacion <= 69){
        println("Tiene D")
    }
    else{
        println("Tiene F")
    }
    //Ejercicio 3: Simulador 🚦 de semáforo
    var colorSemaforo = "Amarillo"

    when (colorSemaforo) {
        "Rojo" -> println("Alto")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Vamos")
        else -> println("Color de luz no válido")
    }
    //Ejercicio 4: ¿par o impar? 🤔
    var Numero = 3
    if(Numero % 2 == 0){
        println("El Numero es Par")
    }else{
        println("El Numero es Impar")
    }
    //Ejercicio 5: Intento 🔑 de inicio de sesión
    // Variables inmutables con datos "guardados"
    var savedUsername = "usuario123"
    var savedPassword = "claveSegura"

    // Variables mutables que simulan datos introducidos por el usuario
    var enteredUsername = "usuario123"   // puedes cambiar esto para probar
    var enteredPassword = "clave123"     // puedes cambiar esto también

    // Verificación de inicio de sesión
    if (enteredUsername == savedUsername) {
        if (enteredPassword == savedPassword) {
            println("Inicio de sesión exitoso")
        } else {
            println("Contraseña incorrecta")
        }
    } else {
        println("Nombre de usuario incorrecto")
    }
    //Ejercicio 6: Guía 🌡️ de temperatura
    // Variable inmutable con la temperatura actual (puede ser Int o Double)
    var temperatura = 50  // Cambia este valor para probar otros escenarios

    // Evaluación con when
    when (temperatura) {
        in Int.MIN_VALUE until 0 -> println("¡Congelación! Usa ropa muy abrigada")
        in 0..10 -> println("Frío. Usa una chaqueta abrigada")
        in 11..20 -> println("Genial. Una chaqueta ligera debería estar bien")
        in 21..30 -> println("Cálido. ¡Disfruta del clima!")
        in 31..Int.MAX_VALUE -> println("¡Caliente! Mantente hidratado")
        else -> println("Temperatura fuera del rango típico")
    }
    //Ejercicio 7: Saludo 👋 de nombre que acepta valores NULL
    // Variable que acepta valores nulos
    var userName: String? = "Alicia"

    // Verificación si userName no es nulo
    if (userName != null) {
        println("¡Hola, $userName!")
    } else {
        println("¡Hola, invitado!")
    }

    // Cambiamos userName a null para ver el otro caso
    userName = null

    // Verificamos nuevamente
    if (userName != null) {
        println("¡Hola, $userName!")
    } else {
        println("¡Hola, invitado!")
    }
}