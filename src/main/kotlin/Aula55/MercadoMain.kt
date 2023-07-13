package Aula55

fun main() {
    val caixa = Caixa()
    while (true) {
        println("Digite o nome do produto ou 'sair' para encerrar:")
        var nome = readln()
        if (nome == "sair") break

      println("Digite o valor do produto:")
      val valor = readLine()?.toDoubleOrNull()
      if (valor == null) continue

      println("Digite a quantidade do produto:")
      val quantidade = readLine()?.toIntOrNull()
      if (quantidade == null ) continue

      caixa.cadastrarProduto(Produto(nome, valor, quantidade))
    }
    caixa.exibirProdutosCadastrados()
    println("Valor total: R$${caixa.exibirValorTotal()}")

    caixa.exibirMensagemListaComprarFeita()
}