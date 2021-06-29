package exemplo12

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.saldo = 200.0

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.saldo} \n")

    println("Deposito na conta do Alex")
    deposita(contaAlex, 50.0)
    println("saldo: ${contaAlex.saldo}")
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}