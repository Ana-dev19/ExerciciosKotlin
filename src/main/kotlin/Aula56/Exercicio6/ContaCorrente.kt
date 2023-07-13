package Aula56.Exercicio6

class ContaCorrente (saldoInicial: Double) : Conta() {
    init {
        saldo = saldoInicial
    }

    override fun deposito(valor: Double) {
        if (valor > 5000.0) {
            println("Operação inválida, procure a sua agência.")
        } else {
            saldo += valor
            println("Depósito realizado com sucesso!")
            saldo()
        }
    }

    override fun saque(valor: Double) {
        saldo -= valor
        println("Saque realizado com sucesso!")
        saldo()
    }
}