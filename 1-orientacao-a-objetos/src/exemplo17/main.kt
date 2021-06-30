package exemplo17

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var saldo = 0.0
    private set

    fun deposita(valor: Double) {
        if (valor > 0) {
        this.saldo += valor
        }
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.deposita(300.0)

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.saldo} \n")
}

