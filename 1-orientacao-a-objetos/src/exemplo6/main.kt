package exemplo6

fun main() {
    testaLacos()
}

fun testaLacos() {
    for (i in 5 downTo 1 step 2) {

        //break ou continue
        if (i == 3) {
            break
        }

        val titular = "Alex"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("titular: $titular")
        println("conta: $numeroConta")
        println("saldo: $saldo \n")
    }
}

