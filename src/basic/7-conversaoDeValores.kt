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
 * Char     ?*
 */

fun teste(n1: Int) {

}

fun main() {
    val b1: Short = 10;
    val c1: Byte = 100;

    // quando multiplicamos um número pelo o outro, o tipo menor é convertido pelo tipo maior
    // no caso a variável b1 vira Int ao multiplicar com o valor 1 Int
    teste(1* b1);

    // Abaixo tem exemplos de como converter um valor pelo outro
    println(c1.toShort());
    println(c1.toInt());
    println(c1.toLong());
    println(c1.toFloat());
    println(c1.toDouble());

    // Strings que contém APENAS números tem como serem convertidas
    "19".toInt();

}