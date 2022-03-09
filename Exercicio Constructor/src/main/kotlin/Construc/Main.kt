import Construc.Clientes
fun main() {

        println("Olá! Por favor, digite seu nome para começarmos: ")
        val nome = readLine()!!
        println("Agora digite seu endereço: ")
        val endereco = readLine()!!
        println("Por último, por favor, adicione o telefone ")
        val telefone = readLine()!!
        var dados = Clientes(nome, endereco, telefone)




            while (true) {
                println("Por favor, digite " +
                        "\n1 para adicionar itens\n" +
                        "\n2 para remover\n" +
                        "\n3 para listar itens do carrinho\n" +
                        "\nDigite qualquer outro valor para encerrar o programa")
            var opc = 0

            while (true){
                println("\nDigite a opção desejada: ")

                try {
                    var dados = Clientes(nome,endereco, telefone)
                    opc = readLine()!!.toInt()
                    break
                }catch (e: Exception){
                    println("Valor inválido")
                }
            }

                when(opc){

                    1 -> {println("Por favor, digite o item a ser adicionado: ")
                val item = readLine()!!
                        dados.additem(item)
                    }
                    2 -> {println("Por favor, digite o item a ser removido: ")
                        val item = readLine()!!
                        dados.removeitem(item)}

                    3 ->  dados.listagens()


                    else ->  break
                }}


            }































