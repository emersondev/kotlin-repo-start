package basic

/**
 * defino um tipo de vararg
 * verifico se as notas não estão vazias
 * incremento cada nota na média
 * divido a média pelo número de notas atribuídas
 */
fun media(vararg notas: Float): Float {
    var media = 0f;
    if(notas.isNotEmpty()) {
        for(nota in notas) {
            media += nota;
        }
        media /= notas.size;
    }
    return media;
}

/**
 * faço uma função e antes passo um tipo "T" pra ela
 * coloco que os valores vão ser desse tipo "T" pro for
 * o tipo "T" é um simbolismo de qualquer coisa
 * "T" é uma convenção para tipo genérico
 */
fun <T> argumentosAleatorios(vararg valores: T){
    for (valor in valores) {
        println("valores aleatórios para a função: $valor");
    }
}
fun main() {
//    println("A média da sala é: ${media(9f,8f,5f,2f,7f,8f,9f,8f,7f,7f,5f,6f,8f,7f,4f,2f)}");
//    argumentosAleatorios("weibfe", 3213, 12f, false, "", "hahaha");

    val str = "lorem ipsum";
    println("Bota a primeira letra em maíusculo: ${str.capitalize()}");
    println("Bota a primeira letra em minúsculo: ${str.decapitalize()}");
    println("Procura o argumento passado por parâmetro, existe? ${str.contains("lo")}");
    println("Começa com l? ${str.startsWith("l")}");
    println("Comela com L? ${str.startsWith("L")}");

    // como se fosse a função argumentosAleatorios
    arrayOf(1,2.4,65,123,"dsf","").size;
}