package oo

enum class Prioridade1 {
    // As enum's são mostradas como string caso use o println
    BAIXA, MEDIA, ALTA
}

// conseguimos passar parâmetros para as enum's, e acessando os mesmo como atributos em classes,
// no exemplo abaixo instanciamos cada enum na variável "p" e acessamos os dados delas pelo ponto
enum class Prioridade2(val id: Int) {
    BAIXA(1), MEDIA(5), ALTA(10);
}

//override
enum class Prioridade3(val id: Int) {
    // na enum BAIXA, sobrescrevemos o método toString()
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
    },
    MEDIA(5), ALTA(10);
}

// Uma classe só com parâmetros // classes podem agregar dados ou parâmetros
class Alarme(var descricao: String, p: Prioridade2)

fun main() {
    Alarme("Alarme para acordar", Prioridade2.ALTA);

    println("Prioridade 1: ${Prioridade1.BAIXA}");

    // Prioridade 3: Ao invés de ele retornar a própria enum como string, como sobrescrevemos o
    // método toString(), ele nos trouxe o retorno que setamos
    println("Prioridade 3: ${Prioridade3.BAIXA}");

    for(p in Prioridade2.values()) {

        if(p.toString() == "MEDIA") {
            println("$p - ${p.id} - Posição: ${p.ordinal}");
            println("Esse é mediano");
            break;
        }
        println("$p - ${p.id} - Posição: ${p.ordinal}");
    }
}