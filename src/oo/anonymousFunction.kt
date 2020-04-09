package oo

fun operator3(x: Int, y: Int, op: (Int,Int) -> Int): Int {
    val ret = op (x, y)
    return ret
}

fun main() {
    operator3(1,2, fun(n1: Int, n2: Int): Int {
        return n1 + n2
    })
}