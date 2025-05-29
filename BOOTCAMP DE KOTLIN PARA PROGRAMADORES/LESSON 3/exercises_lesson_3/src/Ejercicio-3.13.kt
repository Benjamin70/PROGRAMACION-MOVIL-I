// ---------------------------------------------------------
// 🟢 Ejercicio 3.13 - VERSIÓN BÁSICA (ACTIVA POR DEFECTO)
// ---------------------------------------------------------
/*fun main() {
    println("========== Ejercicio 3.13 - VERSIÓN BÁSICA ==========")
    println("Sugerencia: ${whatShouldIDoTodayBasic("happy", "sunny", 24)}")
    println("Sugerencia: ${whatShouldIDoTodayBasic("sad")}")
    println("Sugerencia: ${whatShouldIDoTodayBasic("angry", "rainy", 5)}")
    println("Sugerencia: ${whatShouldIDoTodayBasic("bored", "cloudy", 10)}")
}

fun whatShouldIDoTodayBasic(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Sal a caminar"
        mood == "sad" && weather == "rainy" -> "Mira una película en casa"
        mood == "angry" && temperature < 10 -> "Haz ejercicio para liberar energía"
        mood == "bored" -> "Llama a un amigo"
        else -> "Quédate en casa y lee un libro"
    }
}

// ---------------------------------------------------------
// 🟡 Ejercicio 3.13 - VERSIÓN MEJORADA (COMENTADA)
// 🔁 Si deseas probar esta versión, comenta la función main de arriba
//     y descomenta esta
// ---------------------------------------------------------

/*
fun main() {
    println("\n========== Ejercicio 3.13 - VERSIÓN MEJORADA ==========")
    println("Sugerencia: ${whatShouldIDoTodayImproved("sad", "rainy", 0)}")
    println("Sugerencia: ${whatShouldIDoTodayImproved("happy", "sunny", 25)}")
    println("Sugerencia: ${whatShouldIDoTodayImproved("angry", "windy", 5)}")
    println("Sugerencia: ${whatShouldIDoTodayImproved("bored", "cloudy", 15)}")
    println("Sugerencia: ${whatShouldIDoTodayImproved("relaxed", "sunny", 38)}")
}
*/

fun whatShouldIDoTodayImproved(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
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
*/