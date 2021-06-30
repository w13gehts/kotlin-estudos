package exemploFinal

fun main() {
    println("Bem-vindo ao Bytebank")
    //testaLacos()
    //testaCopiasEReferencias()

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(- 200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
     contaAlex.deposita(50.0)
     println(contaAlex.saldo)

     println("Depositando na conta da Fran")
     contaFran.deposita(70.0)
     println(contaFran.saldo)

     println("sacando na conta do Alex")
     contaAlex.saca(250.0)
     println(contaAlex.saldo)

     println("sacando na conta da Fran")
     contaFran.saca(100.0)
     println(contaFran.saldo)

     println("saque em excesso na conta do Alex")
     contaAlex.saca(100.0)
     println(contaAlex.saldo)

     println("saque em excesso na conta da Fran")
     contaFran.saca(500.0)
     println(contaFran.saldo)

     println("transferência da conta da Fran para o Alex")
     if (contaFran.transfere(100.0, contaAlex)) {
         println("transferência executada com sucesso")
     } else {
         println("falha na transferência")
     }

     println(contaAlex.saldo)
     println(contaFran.saldo)
}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    //private var saldo = 0.0

    //construtor secundario
    /*constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }*/

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    /*fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        }
    }*/
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    //atribuição não é uma cópia, é uma referência
    val contaJoao = Conta("João", 1002)

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    //possuem o mesmo hash
    println(contaJoao)
    println(contaMaria)

    //só se cria um novo espaço quando criamos uma nova instância, um novo objeto
    var contaMariana = Conta("Mariana", 1003)
    println("titular conta mariana: ${contaMariana.titular}")
    println(contaMariana)
}

fun testaLacos() {
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
            //break
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

        //testaCondicoes(saldo)
    }
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

