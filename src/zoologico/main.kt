package zoologico

fun crearAnimales() {
    val leon = Leon()
    val elefante = Elefante()

    println("El animal es un: ${leon.especie}")
    leon.comer()
    leon.hacerSonido()

    println("El animal es un: ${elefante.especie}")
    elefante.comer()
    elefante.hacerSonido()
}

fun crearHabitats() {
    val sabana = Habitat(nombre = "Sabana", area = 1000)
    sabana.imprimirDetalles()

    val jaulaLeones = Jaula(nombre = "Jaula de Leones", tipoAnimal = "León", area = 500)
    jaulaLeones.imprimirDetalles()
}

fun main() {
    println("Creando hábitats en el zoológico...")
    crearHabitats()

    println("\nCreando animales en el zoológico...")
    crearAnimales()
}
