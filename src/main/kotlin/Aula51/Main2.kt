package Aula51

fun main() {
    val nome = Nome()
    println("Digite seu nome:")
    val nomeDigitado = readLine()!!
    val resultado = nome.mensagem(nomeDigitado)
    println(resultado)
}