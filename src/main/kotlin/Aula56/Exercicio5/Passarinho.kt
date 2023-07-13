package Aula56.Exercicio5

class Passarinho (nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("\nVoando")
    }

    override fun comer() {
        println("\nComendo alpiste")
    }

    override fun dormir() {
        println("\nDormindo no ninho")
    }
}
