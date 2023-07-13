package Aula56

class Supermercado {
    private val produtos = mutableListOf<Produto>()
    fun adicionarProduto(produto: Produto){
        produtos.add(produto)
    }
    fun mostrarProdutos(){
        for (produto in produtos){
            println("Nome: ${produto.getNome()}| Codigo de Barras: ${produto.getCodigoDeBarras()} | Data de Validade: ${produto.getDataDeValidade()}")
        }
    }


    }
