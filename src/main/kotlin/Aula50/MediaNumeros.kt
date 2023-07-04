package Aula50

class MediaNumeros {
    fun calcularMedia() {
        var soma = 0.0

        for (i in 1..15) {
            println("Digite o número $i:")
            val numero = readLine()?.toDoubleOrNull()

            if (numero != null) {
                soma += numero
            } else {
                println("Número inválido. Tente novamente.")
                return
            }
        }

        val media = soma / 15
        println("A média dos 15 números é: $media")
    }
}
