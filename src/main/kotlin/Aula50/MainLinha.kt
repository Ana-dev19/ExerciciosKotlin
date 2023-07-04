package Aula50

fun main() {
    println("Digite o ano de nascimento:")
    val anoNascimento = readLine()?.toIntOrNull()

    if (anoNascimento != null) {
        val linhaDoTempo = LinhaDoTempo()
        linhaDoTempo.exibirLinhaDoTempo(anoNascimento)
    } else {
        println("Ano de nascimento inválido.")
    }
}