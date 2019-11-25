// dois pontos int no final da função, é pra setar o tipo do retorno dela
fun calculoComTipoDeRetorno(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}

// sem dois pontos, é a mesma coisa que adicionar no final da função ": Unit" (Unit seria o void)
fun calculoSemRetorno(a: Int, b: Int, c: Int): Unit {
    println("A soma das variáveis é: ${a + b + c}");
}

// função de uma única linha pode ser montada dessa forma
fun funcoesDeUmaLinha(nome: String): String = "Meu nome é ${nome}";

fun main() {
    val a = 10;
    val b = 20;
    val c = 30;

    calculoSemRetorno(a, b, c);
    println("A soma com usando o retorno é: ${calculoComTipoDeRetorno(a, b, c)}");
}