// ============================
// 🟢 Ejercicio 5.16 – Función genérica con Building y materiales (Renombrado)
// ============================

/*
📌 Explicación:
Creamos una función genérica isSmallBuilding() que evalúa si un edificio es pequeño o grande
en función del número total de materiales requeridos.

✅ NOTA:
Se renombraron las clases `BaseBuildingMaterial`, `Wood`, `Brick` y `Building`
agregándoles el sufijo `Alt` para evitar error de redeclaración con las clases ya
declaradas en el archivo Ejercicio-5.11.kt.
*/

// 🔁 Clase base renombrada para evitar conflicto
open class BaseBuildingMaterialAlt {
    open val numberNeeded: Int = 1
}

// 🔁 Subclase Wood renombrada
class WoodAlt : BaseBuildingMaterialAlt() {
    override val numberNeeded = 4
}

// 🔁 Subclase Brick renombrada
class BrickAlt : BaseBuildingMaterialAlt() {
    override val numberNeeded = 8
}

// 🔁 Clase genérica renombrada
class BuildingAlt<out T : BaseBuildingMaterialAlt>(private val material: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("Se requieren $actualMaterialsNeeded ${material::class.simpleName}")
    }
}

// ✅ Función genérica para validar tamaño del edificio
fun <T : BaseBuildingMaterialAlt> isSmallBuilding(building: BuildingAlt<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Edificio pequeño")
    } else {
        println("Edificio grande")
    }
}

// 🔎 Pruebas en función main()
fun main() {
    val woodBuilding = BuildingAlt(WoodAlt())
    val brickBuilding = BuildingAlt(BrickAlt())

    woodBuilding.build()
    isSmallBuilding(woodBuilding)

    brickBuilding.build()
    isSmallBuilding(brickBuilding)
}
