package oo

// usando private contructor() não deixo a classe ser instanciada
// obrigado a usar a classe de forma estática
class Constantes private constructor(){

    // maneira de denotar constantes, não é obrigatório o nome do companion object
    // declarar métodos e variáveis estáticas
    companion object BANCO {
        val TABLE = "Pessoa";
        fun teste() = println("sou um método estático.");
    }

    // object é obrigatório a ter nome
    object VENDAS {
        val TABLE_NAME = "Vendas";

        object COLUNAS {
            val ID = "Id";
        }
    }
}

fun main() {

    // companion object
    println(Constantes.TABLE);
    Constantes.teste();
    Constantes.BANCO.teste();

    println(Constantes.VENDAS.COLUNAS.ID);
}