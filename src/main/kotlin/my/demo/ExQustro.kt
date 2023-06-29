package my.demo

fun main(){
    //Exibi a mensagem para dgitar
    print("Digite a temperatura em graus Celsius: ")
    //fun para ler entrada e armazernar + toInt
    val temperatura = readln().toDouble()
    when {
        temperatura <= 18 -> println("O clima é frio")
        temperatura in 19.0..23.0 -> println("O clima é agradavel")
        temperatura in 24.0..35.0 -> println("O clima é quente")
        temperatura >= 35.0 -> println("O clima é muito quente")
    }
}
