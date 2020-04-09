package oo

data class Fraction(val numerator: Int, val denominator: Int) {
    // overload de operadores (em especifico para frações)
    operator fun plus(add: Fraction): Fraction {
        if (denominator == add.denominator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val commum = denominator * add.denominator
            return Fraction(
                ((commum / denominator) * numerator) + ((commum / add.denominator) *
                        add.numerator), commum
            )
        }
    }

    // incrementando uma fração
    operator fun inc(): Fraction {
        return this
    }
}

fun main() {
    var f1: Fraction = Fraction(3, 2)
    var f2: Fraction = Fraction(5, 3)

    println(f1 + f2)
    f1++
}