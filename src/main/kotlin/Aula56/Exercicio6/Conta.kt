package Aula56.Exercicio6

abstract class Conta {
    var saldo: Double = 0.0

    abstract fun deposito(valor: Double)
    abstract fun saque(valor: Double)

    fun saldo() {
        println("Saldo: R$ $saldo")
    }
}