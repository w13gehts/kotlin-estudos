package exemplo19

fun main() {
    testaCopiasEReferencias()
}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta(numero = 1000, titular = "Alex")
    contaAlex.deposita(300.0)

    println("titular: ${contaAlex.titular}, numero: ${contaAlex.numero}")
    println("saldo: ${contaAlex.saldo} \n")
}

