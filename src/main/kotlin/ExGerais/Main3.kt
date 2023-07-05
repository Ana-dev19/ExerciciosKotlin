package ExGerais

fun main() {
    println("Digite o nome do vendedor:")
    val nome = readLine()!!
    println("Digite o salário fixo do vendedor:")
    val salarioFixo = readLine()!!.toDouble()
    println("Digite a quantidade de vendas efetuadas pelo vendedor:")
    val quantidadeVendas = readLine()!!.toInt()
    val vendas = DoubleArray(quantidadeVendas)
    for (i in 0 until quantidadeVendas) {
        println("Digite o valor da ${i + 1}ª venda:")
        vendas[i] = readLine()!!.toDouble()
    }
    val vendedor = Vendedor(nome, salarioFixo, vendas)
    val salarioFinal = vendedor.salarioFinal()
    println("Nome do vendedor: $nome")
    println("Salário fixo: $salarioFixo")
    println("Salário final: $salarioFinal")
}