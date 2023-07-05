package Aula51

fun main() {
    val imc = IMC()
    println("Digite seu peso (em kg):")
    val peso = readLine()!!.toDouble()
    println("Digite sua altura (em metros):")
    val altura = readLine()!!.toDouble()
    val resultadoIMC = imc.calculaIMC(peso, altura)
    val classificacao = imc.classificacaoIMC(resultadoIMC)
    println("Seu IMC é $resultadoIMC. Classificação: $classificacao")
}