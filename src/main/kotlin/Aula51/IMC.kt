package Aula51

class IMC {
    fun calculaIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }

    fun classificacaoIMC(imc: Double): String {
        return when {
            imc < 18.5 -> "Magreza, Grau de Obesidade: 0"
            imc >= 18.5 && imc < 25 -> "Normal, Grau de Obesidade: 0"
            imc >= 25 && imc < 30 -> "Sobrepeso, Grau de Obesidade: I"
            imc >= 30 && imc < 40 -> "Obesidade, Grau de Obesidade: II"
            else -> "Obesidade Grave, Grau de Obesidade: III"
        }
    }
    fun imprimeTabela(){
        println("IMC\t\tCLASSIFICAÇÃO\t\tOBESIDADE (GRAU)")
        println("<18.5\t\tMagreza\t\t\t0")
        println("18.5-24.9\tNormal\t\t\t0")
        println("25.0-29.9\tSobrepeso\t\tI")
        println("30.0-39.9\tObesidade\t\tII")
        println(">40.0\t\tObesidade Grave\tIII")
    }
}