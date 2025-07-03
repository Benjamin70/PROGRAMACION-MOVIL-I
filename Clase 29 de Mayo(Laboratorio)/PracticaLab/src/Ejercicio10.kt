// Sealed class base con propiedad común
sealed class ElementoSistema(open val nombre: String)

// Subclase Archivo con tamaño en KB
data class Archivo(
    override val nombre: String,
    val tamañoKB: Int
) : ElementoSistema(nombre)

// Subclase Directorio con lista mutable de contenidos
data class Directorio(
    override val nombre: String,
    val contenidos: MutableList<ElementoSistema> = mutableListOf()
) : ElementoSistema(nombre)

// Objeto GestorArchivos para crear archivos y directorios
object GestorArchivos {
    fun crearArchivo(nombre: String, tamañoKB: Int): Archivo {
        return Archivo(nombre, tamañoKB)
    }

    fun crearDirectorio(nombre: String): Directorio {
        return Directorio(nombre)
    }
}

// Función de extensión para calcular el tamaño total de un directorio
fun Directorio.calcularTamañoTotal(): Int {
    var total = 0
    for (elemento in contenidos) {
        total += when (elemento) {
            is Archivo -> elemento.tamañoKB
            is Directorio -> elemento.calcularTamañoTotal() // recursivo
        }
    }
    return total
}

// main para construir y probar la estructura
fun main() {
    val raiz = GestorArchivos.crearDirectorio("raiz")

    val documentos = GestorArchivos.crearDirectorio("documentos")
    documentos.contenidos += GestorArchivos.crearArchivo("cv.pdf", 120)
    documentos.contenidos += GestorArchivos.crearArchivo("factura.pdf", 80)

    val imagenes = GestorArchivos.crearDirectorio("imagenes")
    imagenes.contenidos += GestorArchivos.crearArchivo("foto1.jpg", 250)
    imagenes.contenidos += GestorArchivos.crearArchivo("foto2.jpg", 300)

    raiz.contenidos += documentos
    raiz.contenidos += imagenes
    raiz.contenidos += GestorArchivos.crearArchivo("readme.txt", 10)

    println("Tamaño total del directorio raíz: ${raiz.calcularTamañoTotal()} KB")
}