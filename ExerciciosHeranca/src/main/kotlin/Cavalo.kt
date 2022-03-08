class Cavalo(nome: String, age: Int):Animal(nome, age) {



    override fun agir() {
        println("Correndo como um cavalo")
    }

    override fun emitirSom() {
        println("iiirrrrí, iiirrrrí")
    }


}