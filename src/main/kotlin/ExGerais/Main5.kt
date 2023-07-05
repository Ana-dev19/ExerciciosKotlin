package ExGerais

fun main() {
    val temperatura = Temperatura()
    println("Digite a quantidade de temperaturas a serem convertidas:")
    val quantidade = readLine()!!.toInt()
    val temperaturasCelsius = DoubleArray(quantidade)
    for (i in 0 until quantidade) {
        println("Digite a ${i + 1}ª temperatura em graus Celsius:")
        temperaturasCelsius[i] = readLine()!!.toDouble()
    }
    val temperaturasFahrenheit = temperaturasCelsius.map { temperatura.celsiusParaFahrenheit(it) }
    println("Temperaturas em graus Fahrenheit: ${temperaturasFahrenheit.joinToString()}")
}