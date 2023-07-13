package Aula56.Exercicio5

fun main() {
    val animais = mutableListOf<Animal>()

    while (true) {
        println("Digite o tipo de animal que deseja registrar (cachorro/gato/passarinho) ou 'sair' para sair:")
        val tipo = readLine()!!

        if (tipo == "sair") {
            break
        }

        println("Digite o nome do animal:")
        val nome = readLine()!!

        println("Digite a raça do animal:")
        val raca = readLine()!!

        println("Digite o nome do responsável pelo animal:")
        val responsavel = readLine()!!

        when (tipo) {
            "cachorro" -> animais.add(Cachorro(nome, raca, responsavel))
            "gato" -> animais.add(Gato(nome, raca, responsavel))
            "passarinho" -> animais.add(Passarinho(nome, raca, responsavel))
            else -> println("Tipo de animal inválido")
        }
    }

    for (animal in animais) {
        println("${animal.nome} (${animal.raca}) - Responsável: ${animal.responsavel}")
        animal.movimentar()
        animal.comer()
        animal.dormir()
        println()
    }
}