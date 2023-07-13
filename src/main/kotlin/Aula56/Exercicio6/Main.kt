package Aula56.Exercicio6

fun main() {
    val contaSalario1 = ContaSalario()
    val contaSalario2 = ContaSalario()

    val contaPoupanca1 = ContaPoupanca()
    val contaPoupanca2 = ContaPoupanca()

    val contaCorrente1 = ContaCorrente(1000.0)
    val contaCorrente2 = ContaCorrente(2000.0)

    contaSalario1.deposito(500.0)
    contaSalario1.saque(200.0)

    contaSalario2.deposito(1000.0)
    contaSalario2.saque(300.0)

    contaPoupanca1.deposito(400.0)
    contaPoupanca1.saque(100.0)

    contaPoupanca2.deposito(800.0)
    contaPoupanca2.saque(200.0)

    }