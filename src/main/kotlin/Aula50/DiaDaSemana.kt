package Aula50

class DiaDaSemana {
    fun informarDia(){
        print("Digite um número inteiro (de 1 a 7) representando o dia da semana: ")
        val dia = readLine()!!.toInt()
        val nomeDoDia = if (dia == 1) {
            "Domingo"
        } else if (dia == 2) {
            "Segunda-feira"
        } else if (dia == 3) {
            "Terça-feira"
        } else if (dia == 4) {
            "Quarta-feira"
        } else if (dia == 5) {
            "Quinta-feira"
        } else if (dia == 6) {
            "Sexta-feira"
        } else if (dia == 7) {
            "Sábado"
        } else {
            "Número inválido"
        }
        println("O dia da semana correspondente é: $nomeDoDia")
    }
}
