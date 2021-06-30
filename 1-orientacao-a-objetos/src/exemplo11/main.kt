package exemplo11

fun main() {
    testaCopiasEReferencias()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val contaJoao = Conta()
    contaJoao.titular = "João"

    val contaMaria = Conta()
    contaMaria.titular = "Maria"

    //são objetos diferentes, logo a impressão é diferente
    println("titular da conta do João: ${contaJoao.titular}")
    println("titular da conta da Maria: ${contaMaria.titular}")
}