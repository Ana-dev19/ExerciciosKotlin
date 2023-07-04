package Aula50

class Fibonacci {
    fun calcularFibonacci(n: Int): Int{
        if (n <= 1) {
            return n
        }
        var a = 0
        var b = 1
        var result = 0

        for (i in 2..n) {
            result = a + b
            a = b
            b = result
        }
        return result
    }
}