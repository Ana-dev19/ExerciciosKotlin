package my.demo

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero > 0) {
        println("$numero é positivo")
    } else if (numero < 0) {
        println("$numero é negativo")
    } else {
        println("$numero é zero")
    }
}
