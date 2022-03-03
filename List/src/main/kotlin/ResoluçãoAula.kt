fun main(){
val listaEstoque = mutableListOf<String>()

while (true) {

    println("\n***Estoque do Jóshua da loja***\n")

    println("1 - Adicionar itens no estoque")
    println("2 - Remover itens do estoque")
    println("3 - Atualizar itens do estoque")
    println("4 -Listar itens no estoque")
    println("5 - Sair")

    println("\nEscolha uma opção: ")
    val opc = readLine()!!.toInt()

    println("\n")

    when(opc){

        1 -> {
            print("Digite um item para ser adicionado no estoque: ")
            val item = readLine()!!

            if(item.isEmpty()){
                println("Valor inválido")
            }else{
                listaEstoque.add(item)
                println("Item inserido com sucesso!")
            }
        }

        2 -> {
            print("Digite um item para ser removido do estoque: ")
            val item = readLine()!!

            if(item.isEmpty()){
                println("Valor inválido")
            }else{
                if(listaEstoque.contains(item)){
                    listaEstoque.remove(item)
                    println("O item $item foi removido com sucesso")
                }else{
                    println("O item $item não existe na lista")
                }
            }
        }

        3 -> {
            //Atualização por meio de Index
            /*
            print("Selecione um item de 0 a ${listaEstoque.size - 1}")
            val pos = readLine()!!.toInt()

            if(pos in 0..(listaEstoque.size - 1)){
                print("\nAgora digite o produto será atualizado: ")
                val item = readLine()!!

                listaEstoque[pos] = item
            }else{
                println("Esse item não existe")
            }
             */

            //Atualização por meio do nome
            print("\nDigite o produto que será atualizado: ")
            val item = readLine()!!

            if(item.isEmpty()){
                println("Valor inválido")
            }else{

                if(listaEstoque.contains(item)){

                    val posItem = listaEstoque.indexOf(item)

                    println("Digite o novo item: ")
                    val itemNovo = readLine()!!

                    if(itemNovo.isEmpty()){
                        println("Valor inválido")
                    }else{
                        listaEstoque[posItem] = itemNovo
                        println("Item atualizado com sucesso!")
                    }

                }else{
                    println("O item $item não existe na lista!")
                }

            }

        }

        4 -> {
            if(listaEstoque.isEmpty()){
                println("O estoque está vazio")
            }else{
                println("***Itens do Estoque***")

                listaEstoque.forEach {
                    println(it)
                }

            }
        }

        else -> break

    }

}

}
