fun main() {
    println("Bem-vindo ao Bytebank")
    var i = 0

    while (i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Conta $numeroConta")
        println("Saldo $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1 step 2) {
        println(i)

        if (i == 3) {
            continue
        }

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        saldo = 100 + 2.0
        saldo += 200
        saldo -= 1000.0

        println("Titular $titular")
        println("Conta $numeroConta")
        println("Saldo $saldo")
        println()
    }

     //testaCondicoes(saldo);
}

fun testaCondicoes(saldo: Double) {
    //if comum
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    //when é equivalente
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

