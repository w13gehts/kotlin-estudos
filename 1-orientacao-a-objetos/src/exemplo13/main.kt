package exemplo13

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.saldo = 200.0

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.saldo} \n")

    println("*Deposito na conta do Alex*")
    contaAlex.deposita(50.0)
    println("saldo: ${contaAlex.saldo} \n")

    println("*Saque na conta do Alex*")
    contaAlex.saca(150.0)
    println("saldo: ${contaAlex.saldo} \n")

    println("*Saque em excesso na conta do Alex*")
    contaAlex.saca(450.0)
    println("saldo: ${contaAlex.saldo} \n")
}

