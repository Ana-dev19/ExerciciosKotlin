package Aula56.Exercicio2

open class Livro(val nome: String, val autor: String, val genero: String) {

    class Romance(nome: String, autor: String) : Livro(nome,autor,"Romance")
    class Suspense(nome: String, autor: String) : Livro(nome,autor,"Suspense")
    class FiccaoCientifica(nome: String, autor: String) : Livro(nome,autor,"Ficção Cientifica")
    class Fantasia(nome: String, autor: String) : Livro(nome, autor, "Fantasia")
    class NaoFiccao(nome: String, autor: String) : Livro(nome, autor, "Não Ficção")
    class Biografia(nome: String, autor: String) : Livro(nome, autor, "Biografia")
}