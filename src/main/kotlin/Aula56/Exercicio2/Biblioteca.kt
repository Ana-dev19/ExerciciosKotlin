package Aula56.Exercicio2

class Biblioteca {
    private val livros = mutableListOf<Livro>()
    fun adicionarLivro(livro: Livro){
        livros.add(livro)
    }
    fun mostrarLivros(){
        for(livro in livros){
        println("Nome: ${livro.nome} | Autor: ${livro.autor} | Genero: ${livro.genero}")
        }
    }
}