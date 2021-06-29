package exemplo1

fun main() {
    println("Bem-vindo ao Bytebank!")

    var titular = "Alex"

    //O Kotlin aceita a concatenação similar ao do Java
    println("titular: " + titular)

    //Entretando o uso de String Template é mais indicado
    println("titular: $titular")
}