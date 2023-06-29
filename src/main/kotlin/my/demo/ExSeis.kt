package my.demo

fun main() {
    val taxaDeCambio = 4.86
    print("Digite o valor em dolares: ")
    val valorEmDolares = readLine()!!.toDouble()
    val valorEmReais = valorEmDolares * taxaDeCambio
    println("$valorEmDolares dolares equivalem a R$$valorEmReais reais")
    }

