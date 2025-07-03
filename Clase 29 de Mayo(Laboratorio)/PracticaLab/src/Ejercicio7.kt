// Interfaz Impresora
interface Impresora {
    fun imprimir(documento: String)
}

// Interfaz Escaner
interface Escaner {
    fun escanear(): String
}

// Implementación concreta de Impresora
class ImpresoraLaser : Impresora {
    override fun imprimir(documento: String) {
        println("Imprimiendo con impresora láser: $documento")
    }
}

// Implementación concreta de Escaner
class EscanerDeCamaPlana : Escaner {
    override fun escanear(): String {
        return "Documento escaneado desde escáner de cama plana"
    }
}

// Clase Multifuncional que delega en una impresora y un escáner
class Multifuncional(
    private val impresora: Impresora,
    private val escaner: Escaner
) : Impresora by impresora, Escaner by escaner

// main para probar
fun main() {
    val impresora = ImpresoraLaser()
    val escaner = EscanerDeCamaPlana()

    val equipoMultifuncional = Multifuncional(impresora, escaner)

    equipoMultifuncional.imprimir("Informe mensual.pdf")
    val resultadoEscaneo = equipoMultifuncional.escanear()
    println("Resultado del escaneo: $resultadoEscaneo")
}