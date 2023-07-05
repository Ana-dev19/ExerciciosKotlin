package ExGerais

class MenorNumero {
    fun encontraMenor(numeros: IntArray): Int {
        return numeros.minOrNull() ?: 0
    }

    fun calculaMedia(numeros: IntArray): Double {
        return numeros.average()
    }
}