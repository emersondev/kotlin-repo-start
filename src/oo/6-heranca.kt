package oo

// open é pra poder herdar a classe
open class Maquinario(val marca: String) {
    // para sobrescrever preciso usar open
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

// marca tem que ser passado, pois espera da classe pai
class Computador(marca: String, val nucleos: Int) : Maquinario(marca) {

    // override - é pra sobrescrever minha função
    override fun minhaMarca() {
        "Estou sobrescrevendo minha marca!!"
    }

    fun ligar() {}
    fun processar() {}

    // conceito overload - Sobrecarga
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: Int, s: String) = println("Overload 2")
}

fun main() {
    val c: Computador = Computador("positivo", -1)
    with(c) {
        ligar()
        processar()
        minhaMarca()
        overload(19, "ahhh")
        overload(12)
    }
}