class Clientes {
//Atributos
    var nome = ""
    var idade = 0
    var genero = ""
    var localidade = ""

    override fun toString(): String {
        return "Seu nome $nome"
        "Sua idade $idade"
        "Seu gênero é $genero"
        "Sua localidade $localidade"
    }
//métodos
    var planoa= 80.0
    var planob= 100.0
    var planoc= 250.0


    //*Métodos
// Tipos de planos (a, b, c)
// Valores dos planos
// Escolher planos

    fun tiposDePlano(){

        println("Escolha 1 para saber mais sobre o Plano A, 2 para o Plano B e 3 para o plano C ")
        val escolha = readln()!!.toInt()

        if(escolha == 1){
       println("O plano A oferece 60 Mega de internet\n")

    } else if(escolha == 2){
            println("O plano B oferece 150 Mega de internet, e muitos canais de TV a cabo\n")
    }else{

            println("O plano C oferece 250 Mega de internet, muitos canais de TV a cabo e um ano de netflix de brinde.\n")
        }
    }

    fun valores(){

        println("Para saber os valores, escolha o plano desejado, sendo 1 para o Plano A, 2 para o Plano B, 3 para o Plano C e 4 para exibir todos os valores: ")
        val escolha2 = readln()!!.toInt()

        if(escolha2 == 1){
            println("O plano A custa $planoa")

        }else if(escolha2== 2){
            println("O plano B custa $planob reais")


        }else if(escolha2==3){
            println("O plano B custa $planoc reais")

        }else{

            println("\nO plano A custa $planoa reais"+"\nO plano B custa $planob reais\n"+"O plano C custa $planoc reais \n")
        }



    }
    fun escolhaDePlano(){

        println("Para aderir o plano A, digite 1, para aderir ao plano B, digite 2, ou para aderir o plano C, digite 3: ")
        val aderir = readln()!!.toInt()

        if(aderir==1){

            print("Parabéns! Você acaba de aderir ao plano de 60 Megas de Internet.")

        }else if (aderir==2){

            print("Parabéns! Você acaba de aderir ao plano de 150 Megas de Internet e mais canais de TV a cabo.")

        } else{
            print("Parabéns! Você acaba de aderir ao plano de 250 Megas de Internet, mais canais de TV a cabo e 1 ano de Netflix.")

        }

    }
}