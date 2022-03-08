class Preguiça(nome: String, age: Int):Animal(nome, age) {



    override fun agir() {
        println("Subindo na árvore")
    }

    override fun emitirSom() {
        println("sniff sniff sniff")
    }
}