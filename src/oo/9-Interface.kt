package oo

// interface não pode ser inicializado nada, nem variáveis pode ser atribuídas
interface Maquinaa {
    var peso: Float;
    fun ligar()
    fun desligar() {
        println("Off");
    }
}

// sou obrigado a usar override em peso
class Computadorr(override var peso: Float) : Maquinaa {
    override fun ligar() {

    }
}

interface interface1 {
    fun ola() {
        println("Interface 1");
    };
}

interface interface2 {
    fun ola();
}

class ImplementadaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }
}

fun main() {

    ImplementadaInterface.ola();

}