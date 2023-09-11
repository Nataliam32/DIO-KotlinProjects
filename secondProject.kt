class secondProject {
}

fun main() {
   fun printAll(vararg messages: String) {
        for(m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
} // o vararg permite que se escreva um array de strings em uma só variável (mas não é uma array)