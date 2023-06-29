package my.demo

fun main(){
    print("Digite a base do retangulo:  ")
    val base = readln()!!.toDouble()

    print("Digite a altura do retangulo: ")
    val altura = readln()!!.toDouble()
    val area = base * altura
    println("A base do retangulo é $area")
}