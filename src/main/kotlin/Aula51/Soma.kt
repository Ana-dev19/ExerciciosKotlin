package Aula51

class Soma {
    fun somatoria(num: Int): Int {
        var soma = 0
        for (i in 1..num) {
            soma += i
        }
        return soma
    }
}

