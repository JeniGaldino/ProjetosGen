fun main() {

    var calc = Calculadora()

    println("Por favor digite dois números: ")
    var n1 = readln()!!.toInt()
    var n2 = readln()!!.toInt()



    println(
        "Por favor digite:" +
                "\n + para adição\n" +
                "\n - para subtração \n" +
                "\n * para multiplicação \n" +
                "\n / para divisão \n"
    )
    val opc = readln()!!

    when (opc) {

        "+" -> {calc.add(return)}
        "-" -> {calc.sub(return)}
        "*" -> {calc.multi(return)}
        "/" -> {calc.div(return)}

    }


}



