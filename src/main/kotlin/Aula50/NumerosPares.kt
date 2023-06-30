package Aula50

class NumerosPares {
    fun verificarPares(){
        val numeros = mutableListOf<Int>()
        for (i in 1..10){
            print("Digite o numero $i: ")
            val numero = readLine()!!.toInt()
            numeros.add(numero)
        }
        println("Os numeros pares da lista são: ")
        for (numero in numeros){
            if (numero % 2 == 0){
                println(numero)
            }
        }
    }
}