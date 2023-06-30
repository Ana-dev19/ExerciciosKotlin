package Aula50

class ListaDeCompras {
    fun criarLista() {
        val lista = mutableListOf<String>()
        print("Digite a quantidade de itens que deseja adicionar na lista de compras: ")
        val quantidade = readLine()!!.toInt()
        for (i in 1..quantidade) {
            print("Digite o nome do produto $i: ")
            val produto = readLine()!!
            lista.add(produto)
        }
        println("Sua lista de compras:")
        for (produto in lista) {
            println("- $produto")
       }
    }
}

