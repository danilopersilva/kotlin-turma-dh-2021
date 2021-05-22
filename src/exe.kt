fun main(){
    var saque = 100
    var saldo = 100
    var limite = 10
    if (saque > saldo && saque <= (saldo + limite)){
        saque -= saldo
        limite -= saque
        saque += saldo
        saldo = 0
        println("$saque   $limite   $saldo")
    }


}
