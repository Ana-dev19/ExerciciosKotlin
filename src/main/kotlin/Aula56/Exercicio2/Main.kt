package Aula56.Exercicio2

fun main() {
    val biblioteca = Biblioteca()

    val livro1 = Livro.Romance("Orgulho e Preconceito","Jane Austen")
    val livro2 = Livro.Suspense("Coraline", "Neil Gaiman")
    val livro3 = Livro.FiccaoCientifica("A Guerra dos Mundos", "H.G.Wells")

    biblioteca.adicionarLivro(livro1)
    biblioteca.adicionarLivro(livro2)
    biblioteca.adicionarLivro(livro3)

    while (true) {
        println("\n Voce Deseja adicionar um livro? (Sim/Não)")
        val resposta = readLine()

        if (resposta == "Sim") {
            println("Digite o nome do livro:")
            val nome = readLine()
            println("Digite o nome do autor:")
            val autor = readLine()
            println("Digite o gênero do livro (Romance/Suspense/Ficção Científica/Fantasia/Não Ficção/Biografia):")
            val genero = readLine()

            if (nome != null && autor != null && genero != null) {
                val livro = when (genero) {
                    "Romance" -> Livro.Romance(nome, autor)
                    "Suspense" -> Livro.Suspense(nome, autor)
                    "Ficção Científica" -> Livro.FiccaoCientifica(nome, autor)
                    "Fantasia" -> Livro.FiccaoCientifica(nome, autor)
                    "Não Ficção" -> Livro.NaoFiccao(nome, autor)
                    "Biografia" ->Livro.Biografia(nome, autor)
                    else -> null
                }

                if (livro != null) {
                    biblioteca.adicionarLivro(livro)
                    println("Livro adicionado com sucesso!")
                } else {
                    println("Gênero inválido. Tente novamente.")
                }
            } else {
                println("Erro ao adicionar livro. Tente novamente.")
            }
        } else if (resposta == "Não") {
            break
        } else {
            println("Resposta inválida. Tente novamente.")
        }
    }

    biblioteca.mostrarLivros()
}
