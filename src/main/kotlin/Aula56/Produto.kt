package Aula56

class Produto(private val nome: String, private val codigoDeBarras: String,private val dataDeValidade: String){
    fun getNome(): String{
        return nome
    }
    fun getCodigoDeBarras(): String {
        return codigoDeBarras
    }
    fun getDataDeValidade(): String{
        return dataDeValidade
    }
}


