package zoologico

open class Habitat(open var nombre: String, open var area: Int = 500) {

    open val capacidad: Int
        get() = area / 20

    open fun imprimirDetalles() {
        println("Hábitat: $nombre")
        println("Área: $area m²")
        println("Capacidad máxima: $capacidad animales")
    }
}

class Jaula(override var nombre: String, var tipoAnimal: String, area: Int) : Habitat(nombre, area) {

    override fun imprimirDetalles() {
        println("Jaula para: $tipoAnimal")
        super.imprimirDetalles()
    }
}




