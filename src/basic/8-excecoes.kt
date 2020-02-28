fun main() {

    // posso colocar quantos catchs eu quiser
    try {
        println("ewrew".toInt());
    }catch (e: NumberFormatException) {
        println("Esse valor não é um número!");
    }
    catch(e: Exception) {
        println("Algo deu errado");
    } finally {
        println("Continuou o programa");
    }
}