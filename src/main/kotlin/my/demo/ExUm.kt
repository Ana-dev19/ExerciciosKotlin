package my.demo

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()
    val antecessor = numero - 1
    println("O antecessor de $numero é $antecessor")
}
