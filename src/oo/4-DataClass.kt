package oo

class Quadrado(val area: Float);

// quando fazemos uma instância de data class e usamos comparação "==" ele compara o valor, e
// não a referência de memória
data class Triangulo(val area: Float);

// classes podem agregar parâmetros|atributos somente, para essa função de transitar dados em
// específico, no kotlin usamos o data class
data class Param(var b: Boolean, var s: String, var i: Int);

fun teste(atributos: Param) {
    println("printando primeiro atributo: ${atributos.b}");
    println("printando segundo atributo: ${atributos.s}");
    println("printando terceiro atributo: ${atributos.b}");
    println("Printando somente a instância: $atributos");
}

fun main() {
    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    // comparando
    println("***********COMPARAÇÃO***********");
    println("Quadrado 1 é igual a quadrado 2? ${q1 == q2}");

    // true por causa que data class entende que só é os parâmetros a serem compados e não a
    // referência de memória
    println("Triângulo 1 é igual a triângulo 2? ${t1 == t2}");

    // hashcode
    println("***********HASH CODE***********");
    println("Valor de q1 em hash code: ${q1.hashCode()}");
    println("Valor de q2 em hash code: ${q2.hashCode()}");
    println("Valor de t1 em hash code: ${t1.hashCode()}"); // são iguais devido ao data class
    println("Valor de t2 em hash code: ${t2.hashCode()}"); // são iguais devido ao data class

    // Conceito de cópia exata
    val t3 = t2.copy(); // data class faz uma instância ao chamar o método copy
    println(t3);

    // usando um data class
    var parametros = Param(true, "setando parametros", 3);
    teste(parametros);
}
