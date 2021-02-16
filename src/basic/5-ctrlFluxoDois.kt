fun operacao(a: Int, b: Int, c: String) {
    // when em formato de switch
    when (c) {
        "Soma" -> {
            println(a + b)
        }
        "Subtração" -> {
            println(a - b)
        }
        "Multiplicação" -> {
            println(a * b)
        }
        "Divisão" -> {
            println(a / b)
        }
        // seria o default do switch
        else -> {
            println("Operação não existente")
        }
    }

    // when com condição
    /** Range é determinar um valor de um ponto ao outro
     * no caso, se o valor de "a" estiver entre 1 a 99
     * a condição é atendida
     */
    when {
        a in 1..99 -> {
            println("Variável 'a' maior que zero e menor que cem")
        }
    }

    // when com condição
    when {
        b > 0 && b < 100 -> {
            println("Variável 'b' maior que zero e menor que cem")
        }
    }

}


fun main() {
    operacao(10, 20, "Soma");
}