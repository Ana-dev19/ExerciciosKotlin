package Aula56.Exercicio3

class Time(nome: String, jogadores: Int, vitorias: Int, esporte: String) {
    private val nome = nome
    private val jogadores = jogadores
    private val vitorias = vitorias
    private val esporte = esporte

    fun getNome(): String {
        return nome
    }

    fun getJogadores(): Int {
        return jogadores
    }

    fun getVitorias(): Int {
        return vitorias
    }

    fun getEsporte(): String {
        return esporte
    }
}
