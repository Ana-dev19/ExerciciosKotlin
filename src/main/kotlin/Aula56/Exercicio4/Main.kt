package Aula56.Exercicio4

import java.text.SimpleDateFormat

fun main() {
    val sistemaDeControleRH = SistemaDeControleRH()

    println("Digite o número de funcionários que deseja registrar:")
    val numFuncionarios = readLine()!!.toInt()

    for (i in 1..numFuncionarios) {
        println("Digite o nome completo do funcionário $i:")
        val nomeCompleto = readLine()!!

        println("Digite o setor do funcionário $i:")
        val setor = readLine()!!

        println("Digite o salário do funcionário $i:")
        val salario = readLine()!!.toDouble()

        println("Digite a data de admissão do funcionário $i (formato dd/MM/yyyy):")
        val dataDeAdmissao = SimpleDateFormat("dd/MM/yyyy").parse(readLine())

        val funcionario = Funcionario(nomeCompleto, setor, salario, dataDeAdmissao)
        sistemaDeControleRH.registrarFuncionario(funcionario)
    }

    sistemaDeControleRH.mostrarFuncionarios()
}