package my.demo

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()
    val sucessor = numero + 1
    println("O sucessor de $numero é $sucessor")
}
