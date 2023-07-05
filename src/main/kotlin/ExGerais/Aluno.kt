package ExGerais

class Aluno(val nome: String, val notas: DoubleArray) {
    fun media(): Double {
        return notas.average()
    }
}
