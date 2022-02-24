fun main(){

    //Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)




    var idade = 0
    var soma50 = 0
    var soma21 = 0



    println("Por favor, insira as idades: ")
    readLine()!!.toInt()

    while(idade != -99) {

        if(idade<21) soma21++;

        if(idade>50) soma50++;

        println("Digite a idade, se quiser parar digite -99")
         idade= readLine()!!.toInt()
    }

    println("A quantidade de pessoas com menos de 21 é de $soma21")
    println("A quantidade de pessoas com menos de 50 é de $soma50")
    }






