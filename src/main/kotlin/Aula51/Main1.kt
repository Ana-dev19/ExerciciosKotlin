package Aula51

fun main() {
    val soma = Soma()
    println("Digite um número:")
    val num = readLine()!!.toInt()
    val resultado = soma.somatoria(num)
    println("A soma de todos os números de 1 até $num é $resultado")
}