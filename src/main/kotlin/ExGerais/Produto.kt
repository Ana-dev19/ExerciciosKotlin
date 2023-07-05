package ExGerais

class Produto {
    fun calculaPrecoVenda(precoCusto: Double, percentual: Double): Double {
        return precoCusto * (1 + percentual / 100)
    }
}
