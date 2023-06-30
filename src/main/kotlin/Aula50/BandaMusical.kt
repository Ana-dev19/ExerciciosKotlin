package Aula50

class BandaMusical {
    fun adicionarMusicas() {
        print("Digite o nome da banda: ")
        val nomeDaBanda = readLine()

        val musicas = Array<String>(3){""}
        println()
        println("----Coloque aqui suas musicas----")
        for (i in musicas.indices) {
            print("Digite o nome da música ${i + 1}: ")
            val musica = readLine()!!
            musicas[i] =(musica)
        }
        println("Sua banda --> $nomeDaBanda")
        println()
        for (musica in musicas) {
        println("Suas musicas --> $musica")
        }
    }
}
