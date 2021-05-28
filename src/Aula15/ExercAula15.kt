package Aula15

fun main(){

    val foto = Foto("rosto","Pessoa")
    val documento = Documento("CNH","CNH")
    val contrato = Contrato("Contrato de compra e venda", "xpto")
    val impressora = Impressora()
    impressora.inserirImprimivel(foto)
    impressora.inserirImprimivel(documento)
    impressora.inserirImprimivel(contrato)
    impressora.imprimirTodos()
}






interface ImprimivelAula15{



    fun imprimir()
}

class Foto(val nome: String,
           val tipoDeDocumento: String): ImprimivelAula15{

    override fun imprimir() {
        println("Eu Sou uma Selfie $nome + $tipoDeDocumento")
    }
}
class Documento(val nome: String,
                val tipoDeDocumento: String): ImprimivelAula15{


    override fun imprimir() {
        println("Eu Sou um {$nome + $tipoDeDocumento}")
    }
}
class Contrato(val nome: String,
               val tipoDeDocumento: String): ImprimivelAula15{
    override fun imprimir() {
        println("Eu Sou um $nome $tipoDeDocumento")
    }
}

class Impressora(
    val listaimprimivel: MutableList<ImprimivelAula15> = mutableListOf()){

    fun imprimirTodos(){
        listaimprimivel.forEach{
            it.imprimir()
        }
    }
}

fun Impressora.inserirImprimivel(imprimivel: ImprimivelAula15) =
    this.listaimprimivel.add(imprimivel)

