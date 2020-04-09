package oo

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf (value: Int) = value / 2 == this // this referencia o Int que vai ser passado

fun main() {
    10.isHalfOf(40)
    10 isHalfOf 40 // infix deixa escrever sem parenteses

    val p1: Person = Person("Gabriel")
    p1 isName "Gabriel"
}