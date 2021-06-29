package exemplo7

fun main() {
    testaLacos()
}

fun testaLacos() {
    var i = 0

    while (i < 5) {
        val titular = "Alex"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("titular: $titular")
        println("conta: $numeroConta")
        println("saldo: $saldo \n")
        i++
    }
}