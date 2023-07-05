package ExGerais

fun main() {
    val calculadora = Calculadora()
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toDouble()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toDouble()
    val resultadoSoma = calculadora.soma(num1, num2)
    val resultadoSubtracao = calculadora.subtracao(num1, num2)
    val resultadoMultiplicacao = calculadora.multiplicacao(num1, num2)
    val resultadoDivisao = calculadora.divisao(num1, num2)
    println("Soma: $resultadoSoma")
    println("Subtração: $resultadoSubtracao")
    println("Multiplicação: $resultadoMultiplicacao")
    println("Divisão: $resultadoDivisao")
}