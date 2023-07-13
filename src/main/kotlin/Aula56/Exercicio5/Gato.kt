package Aula56.Exercicio5

class Gato (nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("\nAndando e saltando em 4 patas")
    }

    override fun comer() {
        println("\nComendo whiskas sachê")
    }

    override fun dormir() {
        println("\nDormindo na caixa")
    }
}