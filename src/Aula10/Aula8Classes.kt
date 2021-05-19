fun main() {
    val bichano = Bichano()
    bichano.come()
    bichano.minhaRaca()
    println(bichano.sexo)

    val gato = Gato()
    gato.minhaRaca()
    println(gato.sexo)
    println(gato.cor)
}

class Cachorro : Animal(
    sexo = "M"
) {

}

open class Gato : Animal(
    sexo = "F",
    cor = "Preto"
) {


}

class Bichano : Gato() {

    override val sexo: String = "M"

    init {
        raca = "Gato"
    }

    override fun come() {
        println("Come do jeito bichano de ser")
    }


}

class Leao : Animal() {

}

open class Animal(
    open val sexo: String = "0"
) {
    var cor = ""
    protected var raca = "Nenhuma"

    constructor(sexo: String, cor: String) : this(sexo) {
        this.cor = cor
    }

    open fun come() {
        println("Come do jeito bichano de ser")
    }

    fun minhaRaca() {
        println("Minha Raça é $raca")
    }
}