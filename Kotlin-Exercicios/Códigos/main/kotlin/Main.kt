import kotlin.math.pow

fun main (){

    var raio = 0.0
    var diametro = 0.0
    var perimetro = 0.0

    println("Por favor, inclua o diâmetro: ")
    diametro = readLine()!!.toDouble()

    raio = diametro / 2
    var area = raio.pow(2)  * 3.14
    perimetro = (2 * 3.14) * raio

    println("A área é de ${"%.2f".format(area)}" + " enquanto o raio é de ${"%.2f".format(raio)}" +
            " e o perimetro é de ${ "%.2f".format(perimetro)}")








}