    package collections

fun main(args: Array<String>) {

    // List - array, Set, Hashmap

    val l1 = listOf<String>("Madrid", "São Paulo", "New York"); // lista imutável
    val l2 = mutableListOf("Madrid", "São Paulo", "New York"); // lista mutável
    val l3 = arrayListOf("Madrid", "São Paulo", "New York"); // lista mutável de array
    // setOf impede que elementos repetidos sejam inseridos
    val s1 = setOf("Madrid", "São Paulo", "Berlim", "Madrid")
    println(s1.size); // printa somente 3

    val h1 = hashMapOf<String, String>(Pair("Chave", "Valor"), Pair("França", "Paris"))
    println(h1.entries) // mostra as entradas
    println(h1["França"]) // pela chave você acessa o valor
}