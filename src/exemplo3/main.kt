package exemplo3

fun main() {
    val titular = "Alex"
    val numeroConta = 1000
    var saldo = 10.0
    saldo += 20.0

    println("titular: $titular")
    println("número da conta: $numeroConta")
    println("saldo da conta: $saldo \n")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

    //o when acima é equivalente ao if abaixo
    if(saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("Conta é negativa")
    }
}