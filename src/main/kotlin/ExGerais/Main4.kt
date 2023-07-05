package ExGerais

fun main() {
    println("Digite a quantidade de alunos:")
    val quantidadeAlunos = readLine()!!.toInt()
    val alunos = arrayOfNulls<Aluno>(quantidadeAlunos)
    for (i in 0 until quantidadeAlunos) {
        println("Digite o nome do ${i + 1}º aluno:")
        val nome = readLine()!!
        val notas = DoubleArray(3)
        for (j in 0 until 3) {
            println("Digite a nota da ${j + 1}ª prova:")
            notas[j] = readLine()!!.toDouble()
        }
        alunos[i] = Aluno(nome, notas)
    }
    for (aluno in alunos) {
        val media = aluno!!.media()
        println("Nome do aluno: ${aluno.nome}")
        println("Média: $media")
    }
}