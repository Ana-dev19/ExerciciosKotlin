package Aula51

fun main() {
    val retangulo = Retangulo()
    println("Digite a base do retângulo:")
    val base = readLine()!!.toDouble()
    println("Digite a altura do retângulo:")
    val altura = readLine()!!.toDouble()
    val area = retangulo.calculaArea(base, altura)
    println("A área do retângulo é $area")
}