fun main (){

//Escrever um programa que receba vários números inteiros no teclado.
// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

    var n= 1
    var media = 0

    var soma = 0

     do{
        println("Por favor digite um número")
        n = readLine()!!.toInt()
    soma+=n
    } while (n != 0)
    
         if(n % 3 == 0){

             media=soma/n

             println("A média é de $media")

         }





    }
















