package zoologico

abstract class Animal {
    abstract val especie: String
}

interface AccionAnimal {
    fun comer()
    fun hacerSonido()
}

class Leon : Animal(), AccionAnimal {
    override val especie: String = "León"

    override fun comer() {
        println("León: Cazar y comer carne")
    }

    override fun hacerSonido() {
        println("León: Rugir")
    }
}

class Elefante : Animal(), AccionAnimal {
    override val especie: String = "Elefante"

    override fun comer() {
        println("Elefante: Comer hierba y frutas")
    }

    override fun hacerSonido() {
        println("Elefante: Barritar")
    }
}

