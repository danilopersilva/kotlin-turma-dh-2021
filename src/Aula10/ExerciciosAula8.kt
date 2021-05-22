fun main() {
    val danilo = Cliente(1234, "Pereira", "35619", "330432")
    val contaPoupancaInter = Poupanca(cliente = danilo, 1.0)
    contaPoupancaInter.deposito(200.00)
    contaPoupancaInter.recolherJuros()
}


open class Cliente(
    var numeroCliente: Int = 0,
    val sobrenome: String = "0",
    var Rg: String = "0",
    var CPf: String = "0"
) {

}

open class Conta(cliente: Cliente) {

    var saldo: Double = 0.0

    fun deposito(valor: Double) {

        saldo += valor
        println("O novo Saldo é $saldo")
    }

    open fun sacar() {
    }

    fun consultarSaldo() {
    }
}

class Poupanca(
    cliente: Cliente,
    var taxaJuros: Double = 3.5
) : Conta(cliente = cliente) {

    fun recolherJuros() {
        val juros = saldo * (taxaJuros / 100)
        saldo += juros
        println("Meu novo saldo é $saldo")
    }
}

class CC(cliente: Cliente, var txJuros: Double) : Conta(cliente = cliente) {


    fun depositarCheque() {

    }

    override fun sacar() {

    }

    fun recolherJuros() {
        val juros = saldo * txJuros
        saldo += juros
        println("Meu novo saldo é $saldo")
    }
}
