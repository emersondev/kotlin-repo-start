fun main() {
    val phrases = arrayListOf<String>(
        "Devemos perdoar as ofensas, devemos perdoar as afrontas. Devemos perdoar os aluguéis atrasados - Don Ramon",
        "Estou falando com a mula, não com os seus carrapatos - Don Ramon",
        "Sou um cidadão consciente, não fanático - Don Ramon",
        "A diferença entre as duas Alemanhas é simples, é de um lado que se toma vodka e do outro cerveja - Don Ramon",
        "Na salada a gente coloca vinagre, não cachaça - Don Ramon",
        "Um homem sem barriga é um homem sem história",
        "Não se entra em campo sem beijar o gramado",
        "Pra quem tá se afogando, jacaré é tronco",
        "Em rio que tem piranha, jacaré nada de costas",
        "Ter a consciência limpa é ter a memória fraca.",
        "Piolho e dinheiro, quem tem não diz.",
        "É melhor chegar atrasado nesta vida do que adiantado na outra.",
        "Só desse pra porrada quem não se garante na sinuca - Augusto Carrara"
    )

    fun randomPhrases(): String {
        return phrases.random()
    }

    for(i in 0..100) {
        println("Frase $i é - ${randomPhrases()}")
    }
}