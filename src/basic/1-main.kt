/**
 * Type     Bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ?
 * String   ?
 * Char     ?
 */

/** Lembrando sobre unidades de medida
 *
 * 1 Byte = 8 bits
 * 1 kilobyte (kB) = 1024 bytes
 * 1 megabyte (MB) = 1024 kilobytes
 * 1 gigabyte (GB) = 1024 megabytes
 */
fun main() {
    println("Hello World");
    var nome = "Emerson";
    // para colocar tipo, coloque : "dois pontos"
    var idade: Byte = 26;
    var caracter: Char = 'c';


    println("Double: Min: " + Double.MIN_VALUE + " - Max: " + Double.MAX_VALUE);
    println("Float: Min: " + Float .MIN_VALUE + " - Max: " + Float.MAX_VALUE);
    println("Long: Min: " + Long.MIN_VALUE + " - Max: " + Long.MAX_VALUE);
    println("Int: Min: " + Int.MIN_VALUE + " - Max: " + Int.MAX_VALUE);
    println("Short: Min: " + Short.MIN_VALUE + " - Max: " + Short.MAX_VALUE);
    println("Byte: Min: " + Byte.MIN_VALUE + " - Max: " + Byte.MAX_VALUE);

    // Variáveis mutáveis
    var nomeMutavel = "José da Silva";
    nomeMutavel = "José da Silva Sauro";

    // Variáveis imutáveis
    val idadeImutavel = 10;
//    idadeImutavel = 11; // ele não deixa alterar quando é usado val
//    val x; // aqui da erro pois ele não sabe o tipo da variável, não sabendo o que faz com ela
    val y: Int;
    y = 10; // val só aceita uma atribuição

}