fun main(){

    println("Por favor, insira sua idade: ")
    val idade = readln()!!.toInt()

    when(idade){

       in 10..14 -> println("Você se encontra na categoria Infantil")
       in 15..17 -> println("Você se encontra na categoria Juvenil")
        in 18..25 -> println("Você se encontra na categoria Adulto")

    }
}