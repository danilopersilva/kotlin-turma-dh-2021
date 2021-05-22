package Aula12Exerc



fun main(){

    val pessoa1 = Pessoa("Danilo", 12345)
    val pessoa2 = Pessoa("Danilo", 1234)

    val cocinha200ml = Coca(200, 2.50)
    val litrao = Coca(200, 12.00)

    //println(pessoa1.equals(pessoa2))

    println(cocinha200ml.equals(litrao))

    //println(pessoa1.hashCode())

   // println(pessoa2.hashCode())
}
open class Pessoa(var nome: String, var rg: Int){



    override fun equals(other: Any?): Boolean {
        return when(other){
            is Pessoa -> {
                if(this.nome == other?.nome) return true
                return false
            } else -> {
                super.equals(other)
            }
        }
    }
}

class Coca(var tamanho: Int, var  preco: Double){

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Coca -> {
                if(this.tamanho == other?.tamanho) return true
                return false
            } else -> {
                super.equals(other)
            }
        }
    }
}