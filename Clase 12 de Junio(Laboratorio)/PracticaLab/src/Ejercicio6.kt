// Clase base renombrada para evitar duplicados con otros archivos
open class VehiculoDescripcion {
    open fun describirVehiculo() {
        println("Este es un vehículo genérico.")
    }
}

// Clase hija que sobrescribe el método describir
class CocheDescripcion : VehiculoDescripcion() {
    override fun describirVehiculo() {
        super.describirVehiculo()  // Llamada al método de la clase padre
        println("Más específicamente, un coche de 4 ruedas.")
    }
}

fun main() {
    val miCoche = CocheDescripcion()
    miCoche.describirVehiculo()
}
