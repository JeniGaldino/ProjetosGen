fun main (){

//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
// No final, mostre a soma dos números digitados.(DO...WHILE)

    var n= 1
    var soma = 0


    do {

        println("Por favor, digite um número: ")
       n= readln()!!.toInt()
        soma+= n
    } while (n != 0)

    println("A soma dos números digitados é igual a $soma")


}













