package exemplo2

fun main() {
    //O val não permite modificar o valor a partir do momento que se faz a inicialização
    //para que seja modificável, é necessário utilizar do var
    var titular = "Alex"
    titular = "Alex Felipe"

    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("titular: $titular")
    println("número da conta: $numeroConta")
    println("saldo da conta: $saldo")

}