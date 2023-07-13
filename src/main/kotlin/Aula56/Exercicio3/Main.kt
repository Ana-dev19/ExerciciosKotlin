package Aula56.Exercicio3

fun main() {
    val controleDeTimes = ControleDeTimes()

    println("-----------------------------------------------------")
    val time1 = Time("São Paulo", 11, 10, "Futebol")
    val time2 = Time("Corinthians", 11, 100, "Futebol")
    val time3 = Time("Ponte Preta", 11, 6, "Futebol")

    controleDeTimes.adicionarTime(time1)
    controleDeTimes.adicionarTime(time2)
    controleDeTimes.adicionarTime(time3)

    while (true) {
        println("\nVoce deseja adicionar um time? (Sim/Não)")
        val resposta = readLine()

        if (resposta == "Sim") {
            println("Digite o nome do time:")
            val nome = readLine()
            println("Digite o número de jogadores do time:")
            val jogadores = readLine()?.toIntOrNull()
            println("Digite o número de vitórias do time:")
            val vitorias = readLine()?.toIntOrNull()
            println("Digite o esporte que o time joga (Futebol/Basquete/Vôlei/Tênis):")
            val esporte = readLine()

            if (nome != null && jogadores != null && vitorias != null && esporte != null) {
                if (esporte == "Futebol" || esporte == "Basquete" || esporte == "Vôlei" || esporte == "Tênis") {
                    val time = Time(nome, jogadores, vitorias, esporte)
                    controleDeTimes.adicionarTime(time)
                    println("\nTime adicionado com sucesso!")
                } else {
                    println("Esporte inválido. Tente novamente.")
                }
            } else {
                println("Erro ao adicionar time. Tente novamente.")
            }
        } else if (resposta == "Não") {
            break
        } else {
            println("Resposta inválida. Tente novamente.")
        }
    }
    println("\n-----Lista de times-----")
    controleDeTimes.mostrarTimes()
}