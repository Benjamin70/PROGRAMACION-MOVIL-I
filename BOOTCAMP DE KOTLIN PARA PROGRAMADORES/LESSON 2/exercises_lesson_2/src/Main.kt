//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 //OPERADORES EN KOTLIN

    //Suma
    println(1 + 1)

    //Resta
    println(53 - 3)

    //Division
    println(50 / 10)
    println(1 / 2)
    println(1.0 / 2.0)

    //Mutliplicaicon
    println(6 * 50)

    //2.6-Cuestionarios: Tiempo de Practica-Ejercicio
    Cuestionarios_Tiempo_de_Practica_Ejercicios_1_al_5()
    //2.9-Cuestionarios: Tiempo de Practica-Ejercicio
    Cuestionarios_Tiempo_de_Practica_Ejercicios_1_al_2()
    //2.12-Cuestionarios: Tiempo de Practica-Ejercicio
    Cuestionarios_Tiempo_de_Practica_Ejercicios_1()
}

fun Cuestionarios_Tiempo_de_Practica_Ejercicios_1_al_5() {
    println("--------------------------------------------------------------------------")
    println("----------------2.6-Cuestionarios: Tiempo de Practica-Ejercicio-1----------------")
    // --- Lista de tareas: Reproducción y cálculo de peces ---
    val totalFish = 2.plus(71).plus(233).minus(13)
    val aquariumsNeeded = totalFish.div(30).plus(if (totalFish % 30 > 0) 1 else 0)

    println("Total fish left: $totalFish")         // Resultado esperado: 293
    println("Aquariums needed: $aquariumsNeeded")  // Resultado esperado: 10
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.6-Cuestionarios: Tiempo de Practica-Ejercicio-2----------------")
    // --- Lista de tareas: Variables mutables e inmutables ---
    var rainbowColor = "Red"
    rainbowColor = "Blue" // Cambio permitido

    val blackColor = "Black"
    // blackColor = "Gray" // ❌ Esto da error porque 'val' no permite reasignación
    println("Rainbow color: $rainbowColor")
    println("Black color: $blackColor")
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.6-Cuestionarios: Tiempo de Practica-Ejercicio-3----------------")
    // --- Lista de tareas: Nullabilidad en variables ---
    var rainbowColorNullable: String? = "Green"
    rainbowColorNullable = null

    var greenColor: String? = null              // Forma explícita
    val blueColor = null                        // El compilador infiere como tipo Nothing?
    println("Rainbow nullable: $rainbowColorNullable")
    println("Green color: $greenColor")
    println("Blue color: $blueColor")
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.6-Cuestionarios: Tiempo de Practica-Ejercicio-4----------------")
    // --- Lista de tareas: Listas con elementos nulos y lista nula ---
    val nullList1: List<String?> = listOf(null, null)       // Lista con elementos nulos
    val nullList2 = listOf<String?>(null, null)             // Otra forma equivalente
    val nullList: List<String>? = null                      // Lista completamente nula
    println("nullList1: $nullList1")
    println("nullList2: $nullList2")
    println("nullList: $nullList")
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.6-Cuestionarios: Tiempo de Practica-Ejercicio-5----------------")
    // --- Lista de tareas: Uso del operador Elvis con variable nullable ---
    val nullTest: Int? = null
    val result = nullTest?.plus(1) ?: 0
    println("Resultado de nullTest: $result")  // Resultado esperado: 0
    println("--------------------------------------------------------------------------")
}

fun Cuestionarios_Tiempo_de_Practica_Ejercicios_1_al_2() {
    println("--------------------------------------------------------------------------")
    println("----------------2.9-Cuestionarios: Tiempo de Practica-Ejercicio-1----------------")
    // --- Lista de tareas: Variables de cadena con preferencia por tipo de pescado ---
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    println("Do I like to eat $trout? ${if (trout == "trout") "Yes!" else "No"}")
    println("Do I like to eat $haddock? ${if (haddock == "haddock") "No!" else "Maybe"}")
    println("Do I like to eat $snapper? ${if (snapper == "snapper") "Yes!" else "No"}")
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.9-Cuestionarios: Tiempo de Practica-Ejercicio-2----------------")
    // --- Lista de tareas: Declaración when para clasificar nombre de pez ---
    val fishName = "Salmon"

    when (fishName.length) {
        0 -> println("Error: Fish name is empty")
        in 3..12 -> println("Good fish name")
        else -> println("Fish name is OK")
    }
    println("--------------------------------------------------------------------------")
}

fun Cuestionarios_Tiempo_de_Practica_Ejercicios_1() {
    println("--------------------------------------------------------------------------")
    println("----------------2.12-Cuestionarios: Tiempo de Practica-Ejercicio-3----------------")
    // --- Crear una matriz de números del 11 al 15 y convertir a lista de cadenas ---
    val numbers = arrayOf(11, 12, 13, 14, 15)
    val stringList = mutableListOf<String>()

    for (number in numbers) {
        stringList.add(number.toString())
    }

    println("String list from array: $stringList")
    println("--------------------------------------------------------------------------")

    println("--------------------------------------------------------------------------")
    println("----------------2.12-Cuestionarios: Tiempo de Practica-Ejercicio-4----------------")
    // --- Crear una lista de números entre 0 y 100 divisibles por 7 ---
    val divisibleBy7 = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) {
            divisibleBy7.add(i)
        }
    }

    println("Numbers divisible by 7 from 0 to 100: $divisibleBy7")
    println("--------------------------------------------------------------------------")
}