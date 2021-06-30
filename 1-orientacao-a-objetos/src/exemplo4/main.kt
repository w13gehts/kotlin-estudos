package exemplo4

fun main() {
    var saldo = 10.0

    println("saldo da conta: $saldo \n")
    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}