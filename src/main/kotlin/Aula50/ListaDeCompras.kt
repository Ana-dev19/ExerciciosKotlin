package Aula50

class ListaDeCompras {
    fun criarLista() {
        print("Digite a quantidade de itens que deseja adicionar na lista de compras: ")
        val quantidade = readLine()!!.toInt()
        val lista = Array<String>(quantidade) { "" }
        for (i in lista.indices) {
            print("Digite o nome do produto ${i + 1}: ")
            val produto = readLine()!!
            lista[i] = produto
        }
        println("Sua lista de compras:")
        for (produto in lista) {
            println("- $produto")
        }
    }
}


