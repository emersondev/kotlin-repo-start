package oo

interface Funcionario {
    fun calculaBonus();
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus de gerente: 500")
    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus de técnico: 200")
    }

}

// Recebe um objeto do tipo funcionario, como o método é do objeto instanciado, ele executa o
// método do objeto
fun calculo(func: Funcionario) {
    func.calculaBonus()
}

fun main() {
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()

    calculo(f1)
    calculo(f2)
}