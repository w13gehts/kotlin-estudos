package exemplo18

fun main() {
    testaCopiasEReferencias()
}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(300.0)

    println("titular: ${contaAlex.titular}, numero: ${contaAlex.numero}")
    println("saldo: ${contaAlex.saldo} \n")
}

