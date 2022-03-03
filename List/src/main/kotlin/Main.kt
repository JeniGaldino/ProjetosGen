fun main() {

    val produtos = mutableListOf<String>()

    do {
        println("Digite o produto: ")
        val prod: String = readLine()!!
        produtos.add(prod)

        println("Deseja adicionar mais produtos?")
        val resposta: String = readLine()!!

    } while (resposta == "sim" || resposta == "SIM")

    produtos.forEach(){
        println(it)
    }

    do {
        println("Deseja remover algum item?")
       val quest = readln()!!

        if(quest == "sim" || quest == "Sim"){
        println("Digite o nome do produto para removê-lo")
            val del = readln()!!
            produtos.remove(del)


        }
    }while (quest == "sim"|| quest == "Sim")
    produtos.forEach(){
        println("Finalizado com sucesso! Os seguintes produtos foram cadastrados $it")
    }

    }



















