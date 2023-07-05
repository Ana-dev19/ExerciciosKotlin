package ExGerais

class Vendedor(val nome: String, val salarioFixo: Double, val vendas: DoubleArray){
    val comissao = 0.15

    fun salarioFinal(): Double {
        val totalVendas = vendas.sum()
        val valorComissao = totalVendas * comissao
        return salarioFixo + valorComissao
    }
}