fun main() {
    println("========== Ejercicio 3.15 - ¿Qué debería hacer hoy? ==========")

    print("¿Cómo te sientes hoy? (happy/sad/bored/angry/relaxed): ")
    val mood = readLine()!!

    println("Sugerencia: ${whatShouldIDoTodayFinal(mood)}")

    println("\n========== Fortune Cookie - WHILE ==========")
    mainFortuneWhile()
}

// -------------------------
// Renombrada: whatShouldIDoTodayFinal
// -------------------------
fun whatShouldIDoTodayFinal(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        shouldStayInBed(mood, weather, temperature) -> "Quédate en cama"
        shouldGoSwimming(temperature) -> "Ve a nadar"
        shouldWalk(mood, weather) -> "Sal a caminar"
        shouldExercise(mood, temperature) -> "Haz ejercicio para liberar energía"
        mood == "bored" -> "Llama a un amigo"
        else -> "Quédate en casa y lee un libro"
    }
}

fun shouldStayInBed(mood: String, weather: String, temp: Int) =
    mood == "sad" && weather == "rainy" && temp == 0

fun shouldGoSwimming(temp: Int) = temp > 35

fun shouldWalk(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

fun shouldExercise(mood: String, temp: Int) =
    mood == "angry" && temp < 10

// -------------------------
// REPEAT versión (comentada)
// -------------------------
/*
fun main() {
    println("========== Fortune Cookie - REPEAT ==========")
    repeat(10) {
        val fortune = getFortune()
        println("Tu fortuna es: $fortune")
        // ❌ break no se puede usar aquí directamente
    }
}
*/

// -------------------------
// WHILE versión (activa)
// -------------------------
fun mainFortuneWhile() {
    var count = 0
    var fortune: String
    do {
        fortune = getFortune()
        println("Tu fortuna es: $fortune")
        count++
    } while (!fortune.contains("Tómatelo con calma") && count < 10)
}

fun getFortune(): String {
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
    return fortunes[birthday % fortunes.size]
}
