import basic.nullSafeTeste

fun main() {

    // para declarar uma variável nula, tenho que colocar interrogação na
    // frente para tratar
    val str: String? = null;
    nullSafeTeste().meuNome();

    // para manipular uma variável nula, tenho que colocar interrogação na
    // frente para tratar
    println(str?.length);

    // caso coloque duas exclamações, o Kotlin exibe o erro e deixa compilar
    println(str!!.length);

}