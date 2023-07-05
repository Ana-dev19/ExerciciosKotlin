package ExGerais

class Temperatura {
    fun celsiusParaFahrenheit(celsius: Double): Double {
        return (9 * celsius + 160) / 5
    }

    fun fahrenheitParaCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }
}