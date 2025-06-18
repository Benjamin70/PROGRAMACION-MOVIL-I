// Clase abstracta renombrada para evitar conflictos
abstract class AnimalSonido(val nombre: String) {

    abstract fun hacerSonidoAnimal()
    abstract fun moverseAnimal()
}

// Clase concreta Perro
class PerroSonido(nombre: String) : AnimalSonido(nombre) {
    override fun hacerSonidoAnimal() {
        println("$nombre dice: ¡Guau guau!")
    }

    override fun moverseAnimal() {
        println("$nombre corre con energía.")
    }
}

// Clase concreta Gato
class GatoSonido(nombre: String) : AnimalSonido(nombre) {
    override fun hacerSonidoAnimal() {
        println("$nombre dice: ¡Miau!")
    }

    override fun moverseAnimal() {
        println("$nombre se mueve sigilosamente.")
    }
}

// Clase concreta Pájaro
class PajaroSonido(nombre: String) : AnimalSonido(nombre) {
    override fun hacerSonidoAnimal() {
        println("$nombre dice: ¡Pío pío!")
    }

    override fun moverseAnimal() {
        println("$nombre vuela por el cielo.")
    }
}

fun main() {
    val animales: List<AnimalSonido> = listOf(
        PerroSonido("Firulais"),
        GatoSonido("Misu"),
        PajaroSonido("Piolín")
    )

    for (animal in animales) {
        animal.hacerSonidoAnimal()
        animal.moverseAnimal()
        println()
    }
}
