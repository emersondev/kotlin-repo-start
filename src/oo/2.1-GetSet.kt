package oo

class Maquina() {

    // boilerplate ---> código que tem que criar sempre

    var nucleos: Int = 0; get() {
        println("Acessado get")
        return field // se colocar nucleos, ele chama de novo a variável núcleos, field acessa o
        // valor da variável
    } set(value) {
        println("Acessado set")
        field = (10 + value)
    }

}

fun main() {
    val m = Maquina()
    m.nucleos = 5
    println("O resultado é: ${m.nucleos}")
}