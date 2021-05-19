package Aula11
fun main(){
    val foto = Foto()
    println(foto.imprimir())

}
interface Imprimir {
    val nome: String

    val tipoDeDocumento: String

    fun imprimir() {

    }

}

class Foto : Imprimir {

    override val nome = "foto"

    override val tipoDeDocumento = "Tipo Foto"

    override fun imprimir(){
        println("Eu Sou uma Selfie {$nome + $tipoDeDocumento}")

    }
}