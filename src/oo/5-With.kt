package oo

class Maquinas() {

    var nucleos: Int = 0; get() {
        println("Acessado get")
        return field;
    } set(value) {
        println("Acessado set")
        field = (10 + value);
    }

    fun ligar() {
        println("ligou");
    }

    fun processar() {
        println("processou");
    }

    fun desligar() {
        println("desligou")
    }

}

fun main() {
    var m = Maquinas();
    // se somente colocarmos o + ou só o =, ele não entra no get e set
    m.nucleos += 5;
    println("O resultado é: ${m.nucleos}");

    // com with, você consegue usar mais de um método ao mesmo tempo de uma variável, sem tem que
    // ficar usando ela, ex: m.ligar(), podendo usar o método direto
    with(m) {
        ligar();
        processar();
        desligar();
    }

}