package Aula56.Exercicio5

class Passarinho (nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("Voando")
    }

    override fun comer() {
        println("Comendo alpiste")
    }

    override fun dormir() {
        println("Dormindo no ninho")
    }
}
