package exemplo16

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var saldo = 0.0

        set(valor) {
            if (valor > 0) {
                field = valor
                println("field: $field")
            }
        }
        get() {
            return field
        }
}

fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.saldo = 300.0

    println("titular: ${contaAlex.titular}")
    println("saldo: ${contaAlex.saldo} \n")
}

