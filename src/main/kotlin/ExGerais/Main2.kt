package ExGerais

fun main() {
    val menorNumero = MenorNumero()
    println("Digite a quantidade de números:")
    val quantidade = readLine()!!.toInt()
    val numeros = IntArray(quantidade)
    for (i in 0 until quantidade) {
        println("Digite o ${i + 1}º número:")
        numeros[i] = readLine()!!.toInt()
    }
    val menor = menorNumero.encontraMenor(numeros)
    println("O menor número é $menor")
    val media = menorNumero.calculaMedia(numeros)
    println("A média dos números é $media")
}