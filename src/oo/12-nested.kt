package oo

class Computer(val processorModel: String) {


    // inner classes são classes internas, caso não tivesse o inner
    // não conseguiria acessar processorModel
    inner class Memory {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return 70
        }
    }

}

fun main(args: Array<String>) {
    // caso não tivesse escrito inner class, era só instanciar direto dessa maneira
    // Computer.Memory()
    val m1: Computer.Memory = Computer("Intel").Memory()
    m1.getMemoryLevel()
}