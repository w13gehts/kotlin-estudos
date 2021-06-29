package exemplo5

fun main() {
    testaLacos()
}

fun testaLacos() {
    for (i in 1..5) {
        var titular = "Alex"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular: $titular")
        println("conta: $numeroConta")
        println("saldo: $saldo \n")
    }
}

