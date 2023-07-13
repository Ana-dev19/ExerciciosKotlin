package Aula56.Exercicio4

class SistemaDeControleRH {
    private val funcionarios = mutableListOf<Funcionario>()

    fun registrarFuncionario(funcionario: Funcionario) {
        funcionarios.add(funcionario)
    }

    fun mostrarFuncionarios() {
        for (funcionario in funcionarios) {
            println("Nome: ${funcionario.nomeCompleto}")
            println("Setor: ${funcionario.setor}")
            println("Salário: ${funcionario.salario}")
            println("Data de Admissão: ${funcionario.dataDeAdmissao}")
            println()
        }
    }
}
