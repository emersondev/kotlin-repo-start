package oo

abstract class Mamifero(var nome: String) {

    var peso: Float = 0f;

    abstract fun falar();
    fun dormir() {
        println("Estou dormindo");
    }
}

class Cachorro(nome: String, peso: Float) : Mamifero(nome) {

    init {
        this.peso = peso
    }

    override fun falar() {
        println("au au");
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau");
    }
}

fun main() {

    Cachorro("Urso", 12f).falar();
    Gato("Elvis").falar()
}