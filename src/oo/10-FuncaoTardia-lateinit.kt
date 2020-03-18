package oo

class Pessoaa {
    // lateinit faz com que a variável seja iniciada posteriormente mas tem que ser var
    lateinit var nome: String;

    fun geradorDeNome() {
        nome = "testando";
    }
}

fun main() {

    val p = Pessoaa();
    p.geradorDeNome();

}