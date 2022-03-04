class ProdEletro {

var tipoProd = ""
var marca = ""



var quantidade = 0
var valor = 0.0
val totalCelular = 1200.0
val totalTablet = 850.99
val totalPc = 3655.32

    fun produto(){

        println("Por favor escolha o produto: ")
        tipoProd= readln()!!.toString()

        if(tipoProd=="celular"||tipoProd=="Celular"){

            println("Você escolheu o celular, agora escolha a marca: ")

        }else if(tipoProd=="Tablet"||tipoProd=="tablet"){

            println("Você escolheu o tablet, agora escolha a marca: ")

        } else{

            println("Você escolheu o computador, agora escolha a marca: ")

        }


    }
    fun quantidadeT(){

        println("\nAgora escolha a quantidade: ")
        quantidade= readln()!!.toInt()

    }
fun valorT(){

    if(tipoProd=="Celular"|| tipoProd=="celular"){

       valor= totalCelular*quantidade

        println("O total do pedido é igual $valor reais")

    }else if(tipoProd=="Tablet"|| tipoProd=="tablet"){

        valor= totalTablet*quantidade

        println("O total do pedido é igual $valor reais")

    }else{

        valor= totalPc*quantidade

        println("O total do pedido é igual $valor reais")
    }

}
    fun marcaP (){

        marca=readln()!!.toString()

        if(marca == "Samsung" || marca == "samsung") {
            print("Você escolheu ${tipoProd} da marca $marca")
        }else if(marca=="LG"||marca=="lg"){
            print("Você escolheu ${tipoProd} da marca $marca")
        }else{
            print("Você escolheu ${tipoProd} da marca $marca")

        }

    }


}
