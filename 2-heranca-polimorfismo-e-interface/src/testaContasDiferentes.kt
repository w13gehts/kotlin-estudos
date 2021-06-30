fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo da conta corrente: ${contaCorrente.saldo}")
    println("saldo da conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo da conta corrente após o saque: ${contaCorrente.saldo}")
    println("saldo da conta poupança após o saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo da conta corrente após a transferência: ${contaCorrente.saldo}")
    println("saldo da conta poupança após a transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("saldo da conta corrente após a transferência: ${contaCorrente.saldo}")
    println("saldo da conta poupança após a transferência: ${contaPoupanca.saldo}")
}