package collections

data class Food(
    val name: String,
    val calories: Double,
    val ingredients: List<Ingredients> = listOf()
)

data class Ingredients(val name: String, val quantity: Int)

fun main(args: Array<String>) {
    val data = listOf(
        Food(
            "Lazanha", 1200.0,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjericão", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food(
            "Hamburguer", 2000.0,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburguer", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista ?
    // any verifica se há dados
    println("Tenho receitas na lista ? ${if (data.any()) "Sim" else "Não"}")

    // Quantas receitas tenho na coleção ?
    println("Quantas receitas tenho na coleção ?")
    println("Tem ${data.count()} receitas") // count vê o número de receitas

    // Qual a primeira e última receita ?
    // data.first ou last retorna um objeto de food, acessamos o nome pelo .name
    println("A primeira receita é: ${data.first().name}")
    println("A última receita é: ${data.last().name}")

    // Qual a soma de calories
    val sumCalories = data.sumByDouble { it.calories } // it diz sobre a própria variável
    println("A soma de calorias é: $sumCalories")

    // Me dê as duas primeiras receitas!
    val firstTwo = data.take(2) // take pega os dois primeiros elementos da lista
    // withIndex retorna a posição em chave e valor, acessados por .index e .value
    for (x in firstTwo.withIndex()) {
        // retorna em posição 0 e o valor é o objeto, no caso queremos o nome
        println("A posição ${x.index + 1} tem ${x.value.name}")
    }

    // sei como fazer panqueca? e sushi?
    // filter precisa e it, vemos se tem panqueca com any
    val kwonPancake = data.filter { it.name == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (kwonPancake) "Sim" else "não"}")

    val kwonSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer sushi? ${if (kwonSushi) "Sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    // filtra tudo com mais de 500 calorias e printa um por um
    data.filter { it.calories > 500 }.forEach {
        println(
            "A(s) comida(s) com mais de 500 calorias são:" +
                    " " +
                    "${it.name}"
        )
    }

    // Par (chave, valor) de comidas com mais de 500 calorias (nome, calorias)
    /**
     * faço um filter pra retornar tudo com mais de 500 calorias e o no map
     * escolho que o par de chave e valor vão ser os nomes e as calorias
     * após isso o forEach vai percorrer cada elemente do map printando
     * o first (correspondente a chave) e o second (correspondente ao valor)
     */
    data.filter { it.calories > 500 }
        .map { Pair(it.name, it.calories) }
        .forEach { println("${it.first}: ${it.second} calorias") }

    // Quais das receitas possui farinha como ingrediente?
    // para filter tem que passar uma expressão que retorne booleano
    fun hasIngridient(list: List<Ingredients>, name: String): Boolean {
        return list.filter { it.name == name }.any()
    }
    val result = data.filter { hasIngridient(it.ingredients, "Farinha") }
        .forEach{println("As receitas com farinha são: ${it.name}")}
}