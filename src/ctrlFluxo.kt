fun main() {

// não existe ternário no Kotlin

val valor = 10;

// o mais próximo de ternário
val str = if (valor == 10) "Valor é 10" else "Valor não é 10";

// Operador Elvis ?:
val teste: String? = null; // A interrogação depois do Int faz com que o Kotlin aceite nulo na variável
val op: String = teste ?: "Operador Elves atribuído"; // se a variável for nula, recebe a string "Operador Elvis, senão recebe o próprio valor da variável test
println(op);
}