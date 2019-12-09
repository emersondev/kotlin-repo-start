fun main() {

// não existe ternário no Kotlin

    val valor = 10;

// o mais próximo de ternário
    val str = if (valor == 10) "Valor é 10" else "Valor não é 10";

// Operador Elvis ?:
    val teste: String? = null; // A interrogação depois do Int faz com que o Kotlin aceite nulo
    // na variável
    val op: String = teste ?: "Operador Elves atribuído"; // se a variável for nula, recebe a
    // string "Operador Elvis, senão recebe o próprio valor da variável test
    println("rodando op: $op");

    val nome = "Emerson Novais";

    // for
    // for consegue percorrer uma string
    for(c in nome) {
        print("$c ");
    }
    print("\n");
    // for consegue percorrer um range com o step ("a cada") X pegue tal numero
    for(i in 0..100 step 5) {
        // cada numero em 5, pegue o valor
        print("$i ");
    }

    // o inverso do range ----> DownTo
    for(i in 100 downTo 0){
        print("$i ");
    }
    
}