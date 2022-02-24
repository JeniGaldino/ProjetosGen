fun main() {



     println("Por favor, digite 3 números")

    print("Nº:")
    var num1 = readLine()!!.toInt()
    print("Nº:")
    var num2 = readLine()!!.toInt()
    print("Nº:")
    var num3 = readLine()!!.toInt()

    var maior = 0

   if(num1 > num2 && num1 > num3) {

       maior = num1
       println("O maior número foi o $maior")

   }
    else if(num2 > num1 && num2 > num3){
        maior= num2
        println("O maior número foi o $maior")

    } else{
        maior= num3
        println("O maior foi o número $maior")
    }





}












