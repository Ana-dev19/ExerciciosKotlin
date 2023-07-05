package ExGerais

fun main() {
    val produto = Produto()
    println("Digite o percentual de acréscimo:")
    val percentual = readLine()!!.toDouble()
    println("Digite a quantidade de produtos:")
    val quantidade = readLine()!!.toInt()
    val precosCusto = DoubleArray(quantidade)
    for (i in 0 until quantidade) {
        println("Digite o preço de custo do ${i + 1}º produto:")
        precosCusto[i] = readLine()!!.toDouble()
    }
    val precosVenda = precosCusto.map { produto.calculaPrecoVenda(it, percentual) }
    println("Preços de venda: ${precosVenda.joinToString(prefix = "R$", separator = ", R$")}")
}