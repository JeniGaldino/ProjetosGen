import clientedata.Clientes

fun main() {
    val opc = readLine()!!.toInt()
    println("Olá! Por favor, digite seu nome para começarmos: ")
    val nome = readLine()!!
    println("Agora digite seu endereço: ")
    val endereco = readLine()!!
    println("Por último, por favor, adicione o telefone ")
    val telefone = readLine()!!

    try{
    val dados = Clientes(nome,endereco,telefone)
        while(true){


            println("Por favor, escolha uma das opções:" +
                    "1 - Adicionar itens" +
                    "2 - Remover itens" +
                    "3 - Remover itens" +
                    "Qualquer outro valor para sair")

            if(opc == 1){

                Clientes.additem

            }
        }

    }catch (e: Exception){

    println(e.message)

    }








                }












