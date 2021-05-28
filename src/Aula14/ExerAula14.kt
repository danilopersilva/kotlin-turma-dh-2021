package Aula14

import Aula15.ImprimivelAula15


fun main() {

    val produto1 = Produto("Mouse", 50.00)
    val produto2 = Produto("Teclado",100.00)
    val fornecedor = Fornecedor()
    fornecedor.entrando(produto1)
    fornecedor.entrando(produto2)
    fornecedor.listarProdutos()

}

interface Produtos {


    fun entrar()

}


class Produto(
    val descricao: String,
    val preco: Double
): Produtos {

    override fun entrar() {
        println("Seu Produto é $descricao e o valor esta $preco")
    }
}
    class Fornecedor(
        val listaProduto: MutableList<Produtos> = mutableListOf()
    ) {

        fun listarProdutos() {
            listaProduto.forEach {
                it.entrar()
            }
        }
    }

    fun Fornecedor.entrando(produto: Produtos) =
        this.listaProduto.add(produto)
