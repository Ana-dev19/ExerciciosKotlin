package Aula50

fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número:")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        val calculadora = Calculadora()

        println("Selecione uma opção:")
        println("1) Somar os números")
        println("2) Subtrair os números")
        println("3) Multiplicar os números")
        println("4) Dividir os números")

        val opcao = readLine()?.toIntOrNull()

        if (opcao != null) {
            when (opcao) {
                1 -> println("Resultado: ${calculadora.somar(num1, num2)}")
                2 -> println("Resultado: ${calculadora.subtrair(num1, num2)}")
                3 -> println("Resultado: ${calculadora.multiplicar(num1, num2)}")
                4 -> {
                    if (num2 != 0.0) {
                        println("Resultado: ${calculadora.dividir(num1, num2)}")
                    } else {
                        println("Erro: Divisão por zero")
                    }
                }
                else -> println("Opção inválida")
            }
        } else {
            println("Opção inválida")
        }
    } else {
        println("Valores inválidos")
    }
}