package Aula50

fun main() {
    println("Digite um valor:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n >= 0) {
        val fibonacci = Fibonacci()
        val fibonacciNumber = fibonacci.calcularFibonacci(n)
        println("Fib($n) = $fibonacciNumber")
    } else {
        println("Valor inválido.")
    }
}