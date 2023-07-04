package Aula50

class SomaNumeros {
    fun calcularSoma(): Int {
        var soma = 0
        var num = 1

        do {
            soma += num
            num++
        } while (num <= 15)

        return soma
    }
}