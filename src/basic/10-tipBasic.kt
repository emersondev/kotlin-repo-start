package basic

fun meuNome(nome: String) {
    println("Olá $nome")
}

fun meuNomeIdade(nome: String, idade: Short) {
    println("Olá meu nome é $nome, tenho $idade anos.")
}

// é possível acessar um índice de uma string passando o valor dela em um colchete
fun letraIndice(nome: String, indice: Int): Char {
    return nome[indice]
}

fun main() {
//    meuNome("Emerson")
//    meuNomeIdade("Emerson", 26)
    println(letraIndice("Emerson", 0))
}