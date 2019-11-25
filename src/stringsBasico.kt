fun main() {
    val frase = "Kotlin é mais sussa";
    val caracteristica = "SHOW!";
    val nota = "werewfderf";

    println(frase + caracteristica); // concatenação clássica
    println("Kotlin é mais sussa $caracteristica, nota ${nota.length}!"); // concatenação com cifrão

    val str = """vou escrevendo qualquer coisa
        |pois o Kotlin coloca
        |tudo em ordem
        |posteriormente""".trimMargin(); // o trimMargin faz o pipe virar a "parede" do inicio da frase
    println(str);
}