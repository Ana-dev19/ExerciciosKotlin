package Aula50

class SomaDeValores {
        fun somar() {
            val valores = IntArray(5)
            var soma = 0
            for (i in valores.indices) {
                print("Digite o valor ${i + 1}: ")
                valores[i] = readLine()!!.toInt()
                soma += valores[i]
            }
            println("A soma dos valores é: $soma")
        }
    }

