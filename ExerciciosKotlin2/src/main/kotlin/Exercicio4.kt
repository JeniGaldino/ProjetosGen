import java.math.BigDecimal
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    println("Por favor, digite um número: ")
    val n = readLine()!!.toDouble()

    if(n % 2 == 0.0) {

        println(
            "Seu número é par e a raiz quadrada dele é de ${sqrt(n)}")



    }else{

        println("Seu número é impar e ele elevado ao quadrado é igual a ${n.pow(2)}") }}





