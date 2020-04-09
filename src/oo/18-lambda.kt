package oo

fun operator2(x: Int, y: Int, op: (Int,Int) -> Int): Int {
    val ret = op (x, y)
    return ret
}

fun sum2(x:Int, y: Int) = x + y

fun multiply2(x: Int, y:Int): Int = x * y

fun main(args: Array<String>) {

    operator2(1,2, ::sum2)
    operator2(1,2, ::multiply2)

    // aqui trago uma função pra variável
    val l1 = { a: Int, b: Int -> a + b}

    // aqui declaro primeiro o tipo dos parametros e o retorno que espero e depois faço a função
    val l2: (Int, Int) -> Int = {x, y -> x + y}

    // 'a' e 'b' executam subtração entre eles
    operator2(10,20, {a, b -> a - b})
    operator2(10,30, l1)
    operator2(10,40, l2)

}