fun main() {

    val compras = ProdEletro()

    compras.tipoProd = "Celular, Tablet e Computador"
    compras.marca = "Samsung, LG e Dell"


    println("***Loja de Eletrônicos***")
    println("Conheça nossos produtos e marcas:\nProdutos: ${compras.tipoProd} \nMarcas: ${compras.marca}")

    compras.produto()

    compras.marcaP()

    compras.quantidadeT()

    compras.valorT()
}