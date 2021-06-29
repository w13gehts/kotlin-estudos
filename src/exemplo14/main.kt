package exemplo14

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var saldo = 0.0

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor

            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.saldo = 500.0

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.saldo} \n")

    println("titular: ${contaFran.titular}")
    println("saldo: ${contaFran.saldo} \n")

    println("*Transferência da conta da Fran para o Alex* \n")
    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("saldo do Alex: ${contaAlex.saldo}")
    println("saldo da Fran: ${contaFran.saldo}")
}

