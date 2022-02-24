fun main () {

    var crescente = 0
    println("Por favor, digite 3 números")

    print("Nº:")
    var num1 = readLine()!!.toInt()
    print("Nº:")
    var num2 = readLine()!!.toInt()
    print("Nº:")
    var num3 = readLine()!!.toInt()

   if(num1 > num2){

       crescente=num1
       num1 = num2
       num2 = crescente
   }
    else if (num2 > num3){
        crescente=num2
        num2 = num3
        num3 = crescente
    }
    else if(num1>num3){
        crescente = num1
        num1 = num3
        crescente = num3

    }
println("A ordem crescente é $num1,$num2,$num3")

    }

