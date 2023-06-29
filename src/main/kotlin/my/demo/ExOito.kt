package my.demo

fun main(){
    var x = 3
    var y = 5
    if (x != y) {
        val temp = x
        x = y
        y = temp
    }
    println("Depois da troca, x = $x e y = $y")
}
