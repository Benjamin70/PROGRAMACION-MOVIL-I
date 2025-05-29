import java.util.Calendar

fun main() {
    //3.9-Cuestionario: Tiempo de Practica-Ejercicio: NOTA Lo que esta en el main pertenece a esta parte.
    println("--------------------------------------------------------------------------")
    println("-------------------- Ejercicio: Fortune Cookie Mejorado -------------------")

    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("Tómatelo con calma")) break
    }

    println("--------------------------------------------------------------------------")
    //3.3-Cuestionario:Tiempo de Practica-Ejercicio Parte 1
    dayOfWeekParte1()
    //3.3-Cuestionario:Tiempo de Practica-Ejercicio Parte 2
    dayOfWeekParte2()
    //3.7-Cuestionario:Tiempo de Practica-Ejercicio-1
    fortuneCookieProgram()

}
fun dayOfWeekParte1() {
    println("--------------------------------------------------------------------------")
    println("-------------------------3.3-Cuestionario: DayOfWeek - Parte 1------------------------------")
    println("¿Qué día es hoy?")
    println("--------------------------------------------------------------------------")
}
fun dayOfWeekParte2() {
    println("--------------------------------------------------------------------------")
    println("-------------------------3.3-Cuestionario: DayOfWeek - Parte 2------------------------------")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val dayName = when (day) {
        Calendar.SUNDAY -> "Domingo"
        Calendar.MONDAY -> "Lunes"
        Calendar.TUESDAY -> "Martes"
        Calendar.WEDNESDAY -> "Miércoles"
        Calendar.THURSDAY -> "Jueves"
        Calendar.FRIDAY -> "Viernes"
        Calendar.SATURDAY -> "Sábado"
        else -> "Día desconocido"
    }

    println("Hoy es: $dayName")
    println("--------------------------------------------------------------------------")
}
fun fortuneCookieProgram() {
    println("--------------------------------------------------------------------------")
    println("---------------------3.7-Cuestionario: Ejercicio: Galleta de la Suerte----------------------")

    for (i in 1..10) {
        val fortune = getFortuneCookie()
        println("Tu fortuna es: $fortune")
        if (fortune == "¡Tómatelo con calma y disfruta la vida!") break
    }

    println("--------------------------------------------------------------------------")
}
fun getFortuneCookie(): String {
    val fortunes = listOf(
        "¡Tendrás un gran día!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta la vida!",
        "Atesora a tus amigos porque son tu mayor fortuna."
    )

    print("Ingresa tu fecha de nacimiento: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}
fun getBirthday(): Int {
    print("Ingresa tu fecha de nacimiento: ")
    return readLine()?.toIntOrNull() ?: 1
}
fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "¡Tendrás un gran día!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer la moderación.",
        "¡Tómatelo con calma y disfruta la vida!",
        "Atesora a tus amigos porque son tu mayor fortuna."
    )

    return when (birthday) {
        28, 31 -> "¡Sorpresa especial te espera este mes!"
        in 1..7 -> "Hoy es un buen día para ejercer la moderación."
        else -> fortunes[birthday % fortunes.size]
    }
}