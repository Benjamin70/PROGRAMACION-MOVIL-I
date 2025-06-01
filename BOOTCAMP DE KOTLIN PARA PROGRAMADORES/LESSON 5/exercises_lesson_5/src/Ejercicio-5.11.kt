// ============================
// 🟢 Ejercicio 5.11 – Genéricos, clases base y reflexión
// ============================

/*
📌 Explicación:
1. Se crea una clase base `BaseBuildingMaterial` con una propiedad común `numberNeeded`.
2. Se crean subclases `Wood` y `Brick` con valores diferentes para `numberNeeded`.
3. Se implementa una clase genérica `Building` que solo acepta tipos que heredan de `BaseBuildingMaterial`.
4. Se calcula cuántos materiales del tipo pasado necesita el edificio y se imprime usando reflexión.
*/

// Clase base
open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

// Subclase Wood – requiere 4 unidades por material base
class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

// Subclase Brick – requiere 8 unidades por material base
class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

// Clase genérica que acepta solo materiales de construcción
class Building<out T : BaseBuildingMaterial>(private val material: T) {

    private val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("Se requieren $actualMaterialsNeeded ${material::class.simpleName}")
    }
}

// Función principal para probar
fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()  // → Se requieren 400 Wood

    val brickBuilding = Building(Brick())
    brickBuilding.build()  // → Se requieren 800 Brick
}
