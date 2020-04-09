package oo

// sealed não pode ser usada pra fora do arquivo
sealed class Result {
    class Sucess(val message: String): Result()
    class Error(val message: String, val errorCode: Int): Result()
}

class Repo {
    fun execute() : Result {
        // return Result.Sucess("Deu Certo!")
        return Result.Error("Deu erro", 404)
    }
}

fun main(args: Array<String>) {
    val r1 = Repo()
    val result: Result = r1.execute()
    when(result) {
        is Result.Sucess -> {
            println("Deu sucesso")
        }
        is Result.Error -> {
            println("Deu erro")
        }
    }
}