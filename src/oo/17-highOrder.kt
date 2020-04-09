package oo
 // higher order functions - funções de ordem maior

// op recebe dois parametros, o terceiro parâmetro é uma função e retorna Int
fun operator(x: Int, y: Int, op: (Int,Int) -> Int): Int {
    val ret = op (x, y)
    return ret
}

fun sum(x:Int, y: Int) = x + y

fun multiply(x: Int, y:Int): Int = x * y

/**
 * explicando: essa função é específica para listas do tipo List e inteiras
 * o op vai receber um inteiro e somente executa (por causa do unit)
 * for fala para cada item na lista (this referencia o List<Int>)
 * execute a função passada por parâmetro (que vai substituir o op, pois o op referencia uma função
 * que vai ser passada, no caso do exemplo o println)
 */
fun List<Int>.paraCadaInt(op: (Int) -> Unit) {
    for (i in this) {
        op(i)
    }
}

fun <T> Iterable<T>.paraTodos(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
}

fun main(args: Array<String>) {

    val list = listOf(1,2,3,4,5)
    list.forEach{println(it)}
    list.paraCadaInt{println(it)}

    val map = mapOf( Pair("Paris", "França"))
    map.values.paraTodos { println(it) } // it referencia os itens existentes dentro de map.value

    // no lugar da função op, execute a função sum, ::FUNÇÃO é a regra pra executar
    operator(1,2, ::sum)
    operator(1,2, ::multiply)
}