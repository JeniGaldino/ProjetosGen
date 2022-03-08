class Cachorro(nome: String, age: Int):Animal(nome, age){



    override fun agir() {
        println("Correndo como um doguinho")
    }

    override fun emitirSom() {
        println("Au au au au")
    }


}