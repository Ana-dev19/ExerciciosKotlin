package my.demo

fun main(){
    //Exibi a mensagem para dgitar
    print("Digite um numero qualquer: ")
    //fun para ler entrada e armazernar + toInt
    val number = readln().toInt()
    if (number % 5 == 0){
        println("$number é múltiplo de 5")
    } else{
        println("$number não é múltiplo de 5")
    }
    println("---------------------------------")
}