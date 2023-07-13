package Aula56.Exercicio6

class ContaPoupanca : Conta(){
    override fun deposito(valor: Double) {
        println("Quem está fazendo o depósito é a pessoa USUÁRIA ou a EMPREGADORA? (sim/nao)")
        val resposta = readLine()!!

        if (resposta == "sim") {
            saldo += valor
            println("Depósito realizado com sucesso!")
            saldo()
        } else {
            println("Conta Poupança só pode receber depósito do usuário ou do empregador")
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
