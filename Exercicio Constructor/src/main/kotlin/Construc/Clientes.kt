package Construc

class Clientes(private val nome: String) {

    private var endereco = ""
    private var telefone = ""
    private var listaDeCompras = mutableListOf<String>()


    constructor(nome: String, endereco: String): this (nome){
        this.endereco =endereco
    }
    constructor(nome: String, endereco: String, telefone: String): this (nome,endereco) {
        this.telefone= 0.toString()
    }

   /* init {
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty()) {
            println("Dados cadastrados com sucesso!")

        } else {
            throw Exception("Dados incorretos, por favor, digite novamente")


  */

    fun itemTotal(): Int{
        return listaDeCompras.size
    }

    fun additem(item:String){

        if(item.isEmpty()){

            println("Adição invalida")
        } else {

            listaDeCompras.add(item)
            println("O item $item foi adicionado com sucesso")
        }

    }
    fun removeitem(item: String){

        if(item.isEmpty()) {

            println("Remoção invalida")
        }else if(listaDeCompras.contains(item)){

            listaDeCompras.remove(item)
            println("O item $item foi removido com sucesso")
        }else{

            println("O item $item não existe")
        }


    }

    fun listagens(){
        println("***Total de itens***")
        listaDeCompras.forEach(){
            println(it)

        }
        fun itemTotal(): Int{
            return listaDeCompras.size
        }
    }}










