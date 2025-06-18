// Clase base renombrada para evitar conflictos con otros archivos
open class EmpleadoSalario(val nombre: String, val edad: Int, val salarioBase: Double) {

    init {
        println("Se ha registrado un nuevo empleado: $nombre")
    }

    open fun calcularSalarioEmpleado(): Double {  // Método renombrado
        return salarioBase
    }
}

// Clase hija Gerente renombrada
class GerenteSalario(nombre: String, edad: Int, salarioBase: Double, val bono: Double)
    : EmpleadoSalario(nombre, edad, salarioBase) {

    override fun calcularSalarioEmpleado(): Double {
        return salarioBase + bono
    }
}

// Clase hija Desarrollador renombrada
class DesarrolladorSalario(nombre: String, edad: Int, salarioBase: Double, val lenguaje: String)
    : EmpleadoSalario(nombre, edad, salarioBase)

fun main() {
    val gerente = GerenteSalario("Laura", 40, 50000.0, 10000.0)
    val desarrollador = DesarrolladorSalario("Carlos", 28, 35000.0, "Kotlin")

    println("${gerente.nombre} gana: ${gerente.calcularSalarioEmpleado()}")
    println("${desarrollador.nombre} gana: ${desarrollador.calcularSalarioEmpleado()}")
}