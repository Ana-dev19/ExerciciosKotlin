package Aula56.Exercicio3

class ControleDeTimes {
    private val times = mutableListOf<Time>()

    fun adicionarTime(time: Time) {
        times.add(time)
    }

    fun mostrarTimes() {
        for (time in times) {
            println("Nome: ${time.getNome()} | Jogadores: ${time.getJogadores()} | Vitórias: ${time.getVitorias()} | Esporte: ${time.getEsporte()}")
        }
    }
}
