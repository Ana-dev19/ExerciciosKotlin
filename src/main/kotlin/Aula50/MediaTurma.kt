package Aula50

class MediaTurma {
    fun calcularMediaTurma(){
        println("Digite a quantidade de alunos na sala:")
        val quantidadeAlunos = readLine()?.toIntOrNull()

        if (quantidadeAlunos != null && quantidadeAlunos > 0) {
            var totalNotas = 0.0
            var contador = 0

            while (contador < quantidadeAlunos) {
                println("Digite a nota do aluno ${contador + 1}:")
                val nota = readLine()?.toDoubleOrNull()

                if (nota != null) {
                    totalNotas += nota
                    contador++
                } else {
                    println("Nota inválida. Digite novamente.")
                }
            }

            val media = totalNotas / quantidadeAlunos
            println("A média da turma é: $media")
        } else {
            println("Quantidade inválida de alunos.")
        }
    }
}