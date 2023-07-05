package ExGerais

fun main() {
    val conversorMoeda = ConversorMoeda()
    println("Digite a cotação do dólar em reais:")
    val cotacao = readLine()!!.toDouble()
    println("Digite a quantidade de valores em dólares a serem convertidos:")
    val quantidade = readLine()!!.toInt()
    val dolares = DoubleArray(quantidade)
    for (i in 0 until quantidade) {
        println("Digite a ${i + 1}ª quantidade de dólares disponíveis:")
        dolares[i] = readLine()!!.toDouble()
    }
    val reais = dolares.map { conversorMoeda.dolarParaReal(it, cotacao) }
    println("Valores em reais: ${reais.joinToString(prefix = "R$", separator = ", R$")}")
}