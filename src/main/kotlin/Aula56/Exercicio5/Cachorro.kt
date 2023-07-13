package Aula56.Exercicio5

class Cachorro(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("\nAndando em 4 patas")
    }

    override fun comer() {
        println("\nComendo bife")
    }

    override fun dormir() {
        println("\nDormindo na cama do dono")
    }
}