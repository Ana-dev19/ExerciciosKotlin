package Aula55

class Caixa {
    private val produtos = mutableListOf<Produto>()

    fun cadastrarProduto(produto: Produto){
        produtos.add(produto)
    }
    fun exibirProdutosCadastrados() {
        for (produto in produtos) {
            println("${produto.nome} -> R$${produto.valor} -> ${produto.quatidade}")
        }
    }
    fun exibirValorTotal(): Double {
      var total = 0.0
      for (produto in produtos) {
          total += produto.valor * produto.quatidade
      }
        return total
    }
    fun exibirMensagemListaComprarFeita() {
        println("\nSua lista de compra foi concluida com sucesso!")
        println("\nObrigado por escolher nosso supermecado!!!")
    }
}