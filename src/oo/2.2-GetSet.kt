package oo

import java.lang.Exception

class Car(val model: String, val maxSpeed: Int) {
    var trollCurrentSpeed: Int = 0
    private set
    var currentSpeed: Int = 0
        set(value) {
            if(value > maxSpeed) {
                throw Exception("Velocidade maior do que a permitida!")
            } else {
                field = value
            }
        }
}


fun main() {
    val tc = Car("trollCar", 100)
    // tc.trollCurrentSpeed = 0; // não consigo setar valor pra variável com private set

}