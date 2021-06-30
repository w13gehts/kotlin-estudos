package exemplo10

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

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    //ambos são referência ao mesmo objeto, logo a impressão é a mesma
    println("titular da conta do João: ${contaJoao.titular}")
    println("titular da conta da Maria: ${contaMaria.titular}")
}