class Cachorro(nome: String, age: Int):Animal(nome, age){



    override fun agir() {
        println("Correndo")
    }

    override fun emitirSom() {
        println("Au au au au")
    }


}