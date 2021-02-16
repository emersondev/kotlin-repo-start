package oo

// no Kotlin, podemos setar classe recebe os atributos como parâmetro
class Pessoa(var nome: String) {

    var ano: Int? = null
    // construtor precisa chamar os parâmetros da classe obrigatoriamente
    constructor(nome: String, anoNascimento: Int) : this(nome) {
        this.ano = anoNascimento
    }

    fun saudacoes() {
        println("Saudações caro conterrâneo, meu nome é $nome")
    }
}

fun main() {
    // no kotlin não é necessário a palavra new ao instanciar um objeto
    val p1: Pessoa = Pessoa("Emerson", 1993)
    val p2: Pessoa = Pessoa("Jeager")
    p1.saudacoes()
}
