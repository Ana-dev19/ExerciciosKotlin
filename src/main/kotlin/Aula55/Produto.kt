package Aula55

class Produto(nome: String, valor: Double, quatidade: Int) {
    private var _nome = nome
    var nome: String
        get() = _nome
        set(value) {
            _nome = value
        }
    private var _valor = valor
    var valor: Double
        get() = _valor
        set(value) {
            if (value >=0) {
                _valor = value
            }
        }
    private var _quantidade = quatidade
    var quatidade : Int
        get() = _quantidade
        set(value) {
            if (value >=0) {
                _quantidade = value
            }
        }
}