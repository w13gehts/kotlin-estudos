package exemplo15

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    private var saldo = 0.0

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if(valor > 0) {
            saldo = valor
        }
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.setSaldo(300.0)

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.getSaldo()} \n")
}

