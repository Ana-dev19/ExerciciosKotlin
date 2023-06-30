package Aula50

class BandaMusical {
    fun adicionarMusicas() {
        print("Digite o nome da banda: ")
        val nomeDaBanda = readLine()

        val musicas = mutableListOf<String>()
        println("Coloque aqui suas musicas: ")

        for (i in 1..3) {
            print("Digite o nome da música $i: ")
            val musica = readLine()!!
            musicas.add(musica)
        }
        println("Sua banda --> " + nomeDaBanda)
        for (musica in musicas) {
            println("Suas musicas -->" +musica)
        }
    }
}
