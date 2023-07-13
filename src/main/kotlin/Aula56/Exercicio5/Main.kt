package Aula56.Exercicio5

fun main() {
    val animais = mutableListOf<Animal>()

    while (true) {
        println("---------Menu ---------")
        println("1. Registrar animal")
        println("2. Mostrar animais registrados")
        println("3. Sair")
        print("Digite a opção desejada: ")
        val opcao = readLine()!!

        when(opcao) {
            "1" -> {
                println("\nDigite o tipo de animal que deseja registrar (cachorro/gato/passarinho): ")
                val tipo = readLine()!!

                println("\nDigite o nome do animal: ")
                val nome = readLine()!!

                println("\nDigite a raça do animal: ")
                val raca = readLine()!!

                println("\nDigite o nome do responsável pelo animal:")
                val responsavel = readLine()!!

                when (tipo) {
                    "cachorro" -> animais.add(Cachorro(nome, raca, responsavel))
                    "gato" -> animais.add(Gato(nome, raca, responsavel))
                    "passarinho" -> animais.add(Passarinho(nome, raca, responsavel))
                    else -> println("Tipo de animal inválido")
                }
            }

            "2" -> {
                for (animal in animais) {
                    println("${animal.nome} (${animal.raca}) - Responsável: ${animal.responsavel}")
                    animal.movimentar()
                    animal.comer()
                    animal.dormir()
                    println("--------------------------------------------------")
                }
            }
            "3" -> break
            else -> println("Opção inválida")
        }
    }
}