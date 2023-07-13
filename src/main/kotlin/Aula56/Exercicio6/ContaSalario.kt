package Aula56.Exercicio6

class ContaSalario : Conta(){
    init {
        saldo = 1100.0 // Salário mínimo brasileiro em 2022
    }

    override fun deposito(valor: Double) {
        println("Quem está fazendo o depósito é a pessoa EMPREGADORA? (sim/nao)")
        val resposta = readLine()!!

        if (resposta == "sim") {
            saldo += valor
            println("Depósito realizado com sucesso!")
            saldo()
        } else {
            println("Conta Salário só pode receber depósito do empregador")
        }
    }

    override fun saque(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque realizado com sucesso!")
            saldo()
        }
    }
}
