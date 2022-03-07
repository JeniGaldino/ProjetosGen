fun main() {

    val planos = Clientes()
    


    planos.nome = ""
    planos.idade= 0
    planos.genero = ""
    planos.localidade= ""

    println("Por favor, digite seu nome: ")
    planos.nome = readln()!!
    println("Por favor, digite sua idade: ")
    planos.idade = readln()!!.toInt()
    println("Por favor, digite seu gênero: ")
    planos.genero = readln()!!
    println("Por favor, digite sua localidade: ")
    planos.localidade = readln()!!


    println("Confirme seus dados \"Seu nome: ${planos.nome}\"\n" +
            "        \"Sua idade: ${planos.idade}\"\n" +
            "        \"Seu gênero é: ${planos.genero}\"\n" +
            "        \"Sua localidade: ${planos.localidade}\"")

planos.tiposDePlano()

planos.valores()

planos.escolhaDePlano()
}