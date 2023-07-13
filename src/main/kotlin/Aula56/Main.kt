package Aula56

fun main(){
    val supermercado = Supermercado()

    // Objetos de exemplo
    val produto1 = Produto("Arroz", "123456789","01/01/2024")
    val produto2 = Produto("Feijão", "987654321", "01/07,2023")
    val produto3 = Produto("Macarrão","456789123","10/12/2023")

    supermercado.adicionarProduto(produto1)
    supermercado.adicionarProduto(produto2)
    supermercado.adicionarProduto(produto3)

    while (true) {
        println("  Olá,seja bem-vindo!!!  \nDeseja adicionar algum produto a sua lista? (Sim/Não)")
        val resposta = readLine()

        if (resposta == "Sim") {
            println("Digite o nome do produto:")
            val nome = readLine()
            println("Digite o código de barras do produto:")
            val codigoDeBarras = readLine()
            println("Digite a data de validade do produto:")
            val dataDeValidade = readLine()

            if (nome != null && codigoDeBarras != null && dataDeValidade != null) {
                val produto = Produto(nome, codigoDeBarras, dataDeValidade)
                supermercado.adicionarProduto(produto)
                println("\nProduto adicionado com sucesso!")
                print("\n")
            } else {
                println("Erro ao adicionar produto. Tente novamente.")
            }
        } else if (resposta == "Não") {
            break
        } else {
            println("\nResposta inválida. Tente novamente.")
            print("")
        }
    }
    println("\n-----Aqui está sua lista-----")
    supermercado.mostrarProdutos()
}
