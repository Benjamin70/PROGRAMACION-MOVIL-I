fun main() {
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
    //Declarar una lista que se pueda modificar usando mutableListOf. Eliminar un elemento.
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)
    //Declare un array de cadenas usando arrayOf. Use la java.util.Arrays.toString()utilidad array para imprimirlo.
    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))
    //Una matriz declarada con arrayOfno tiene un tipo asociado a los elementos, por lo que se pueden combinar tipos, lo cual resulta útil. Declare una matriz con diferentes tipos.package
    //val mix = arrayOf("fish", 2)
    //Combine dos matrices con el +operador.
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
    //Crea una matriz. Usa un forbucle para iterarla e imprimir los elementos.
    val school5 = arrayOf("shark", "salmon", "minnow")
    for (element in school5) {
        print(element + " ")
    }
    //A PARTIR DE AQUI VAN LOS EJERCICIOS PROPUESTO EN CLASE POR EL MAESTRO(Jueves 29 de Mayo del 2025-Laboratorio de Programacion Movil I)
    // Ejercicio 1: Detalles 👤 opcionales del usuario
    println("Ejercicio 1: Detalles del usuario")
    var userName: String? = "Carlos"
    var userEmail: String? = null
    var userBio: String? = ""

    println("Nombre: ${userName ?: "[No proporcionado]"}")
    println("Correo electrónico: ${userEmail ?: "[No disponible]"}")
    println("Bio: ${if (userBio?.isEmpty() != false) "[El usuario no tiene biografía o está vacía]" else userBio}")
    println("-----------------------------------------\n")

    // Ejercicio 2: Lista simple de tareas pendientes ✅
    println("Ejercicio 2: Lista de tareas pendientes")
    val tareasPendientes: MutableList<String?> = mutableListOf("Comprar leche", "Llamar a mamá", null, "Estudiar Kotlin")

    for (tarea in tareasPendientes) {
        println(tarea ?: "[Sin descripción de la tarea]")
    }

    val primeraTarea = tareasPendientes.firstOrNull()
    if (primeraTarea == null) {
        println("No hay tareas en la lista")
    } else {
        println("Primera tarea: ${primeraTarea ?: "[Sin descripción de la tarea]"}")
    }
    println("-----------------------------------------\n")

    // Ejercicio 3: Precios de los 💰 artículos
    println("Ejercicio 3: Precios de artículos")
    val nombresArticulos = arrayOf("Laptop", "Auriculares", "Mouse", "Monitor")
    val preciosArticulos = arrayOf<Double?>(999.99, null, 25.0, 199.99)

    val indiceSeleccionado = 1
    if (indiceSeleccionado in nombresArticulos.indices) {
        val nombre = nombresArticulos[indiceSeleccionado]
        val precio = preciosArticulos[indiceSeleccionado]
        println("Artículo: $nombre, Precio: ${precio?.let { "\$$it" } ?: "No disponible"}")
    } else {
        println("Índice de elemento no válido")
    }
    println("-----------------------------------------\n")

    // Ejercicio 4: Valores de configuración predeterminados ⚙️
    println("Ejercicio 4: Configuración de la aplicación")
    val settingColorTheme: String? = null
    val settingFontSize: Int? = null

    val actualColorTheme = settingColorTheme ?: "Luz"
    val actualFontSize = settingFontSize ?: 12

    println("Tema de aplicación: $actualColorTheme, Tamaño de fuente: ${actualFontSize}pt.")
    println("-----------------------------------------\n")

    // Ejercicio 5: Suma de puntuaciones 📊 anulables
    println("Ejercicio 5: Puntuaciones")
    val puntuaciones: List<Int?> = listOf(10, null, 5, null, 20, 15)
    var suma = 0

    for (puntuacion in puntuaciones) {
        if (puntuacion != null) {
            println("Puntuación registrada: $puntuacion")
            suma += puntuacion
        } else {
            println("Intento fallido")
        }
    }

    println("Puntuación total de los intentos registrados: $suma")

    // BONUS
    val puntuacionesNoNulas = puntuaciones.filterNotNull()
    println("Puntuaciones válidas: $puntuacionesNoNulas")
    println("-----------------------------------------\n")
}