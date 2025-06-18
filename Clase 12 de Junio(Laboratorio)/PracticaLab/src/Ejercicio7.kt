// Clase abstracta renombrada para evitar conflictos
abstract class AnimalSonidoV2(val nombre: String) {
    abstract fun hacerSonidoAnimalV2()
    abstract fun moverseAnimalV2()
}

// Clase concreta Perro
class PerroSonidoV2(nombre: String) : AnimalSonidoV2(nombre) {
    override fun hacerSonidoAnimalV2() {
        println("$nombre dice: ¡Guau guau!")
    }

    override fun moverseAnimalV2() {
        println("$nombre corre con energía.")
    }
}

// Clase concreta Gato
class GatoSonidoV2(nombre: String) : AnimalSonidoV2(nombre) {
    override fun hacerSonidoAnimalV2() {
        println("$nombre dice: ¡Miau!")
    }

    override fun moverseAnimalV2() {
        println("$nombre se mueve sigilosamente.")
    }
}

// Clase concreta Pájaro
class PajaroSonidoV2(nombre: String) : AnimalSonidoV2(nombre) {
    override fun hacerSonidoAnimalV2() {
        println("$nombre dice: ¡Pío pío!")
    }

    override fun moverseAnimalV2() {
        println("$nombre vuela por el cielo.")
    }
}

// Función externa renombrada para evitar conflicto
fun describirComportamientoV2(animal: AnimalSonidoV2) {
    when (animal) {
        is PajaroSonidoV2 -> println("Este animal vuela alto.")
        is PerroSonidoV2 -> println("Este animal es el mejor amigo del hombre.")
        else -> println("Este animal tiene un comportamiento interesante.")
    }
}

fun main() {
    val perro = PerroSonidoV2("Max")
    val gato = GatoSonidoV2("Luna")
    val pajaro = PajaroSonidoV2("Kiwi")

    val animales = listOf(perro, gato, pajaro)

    for (animal in animales) {
        animal.hacerSonidoAnimalV2()
        animal.moverseAnimalV2()
        describirComportamientoV2(animal)
        println()
    }
}
