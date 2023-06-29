package my.demo

fun main() {
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    val diasVividos = idade * 365
    println("Você já viveu aproximadamente $diasVividos dias")
}
