package Aula10

abstract class Automovel() {

    abstract val nome: String

    abstract fun acelerar()

    abstract fun frear()

}

class Ferrari : Automovel() {

    override var nome: String = "Ferrari F50"

    override fun acelerar() {
        println("Uma Ferrari acelerando")
    }

    override fun frear() {
        println("Uma Ferrari freando")
    }

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Ferrari -> {
                if(this.nome == other?.nome) return true
                return false
            } else -> {
                super.equals(other)
            }
        }
    }
}
