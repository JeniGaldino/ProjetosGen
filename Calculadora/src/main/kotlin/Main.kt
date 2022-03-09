fun main() {



    println(
        "Por favor digite:" +
                "\n + para adição\n" +
                "\n - para subtração \n" +
                "\n * para multiplicação \n" +
                "\n / para divisão \n"
    )
    val opc = readln()!!

    when (opc) {

        "+" ->{
            println("Por favor digite dois números a serem calculados: ")
            Calculadora.add(n1 = readln()!!.toDouble(),n2= readln()!!.toDouble())}

        "-" -> {
            println("Por favor digite dois números a serem calculados: ")
            Calculadora.sub(n1 = readln()!!.toDouble(),n2= readln()!!.toDouble())}
        "*" ->{println("Por favor digite dois números a serem calculados: ")
            Calculadora.multi(n1 = readln()!!.toDouble(),n2= readln()!!.toDouble())}
        "/" ->{println("Por favor digite dois números a serem calculados: ")
            Calculadora.div(n1 = readln()!!.toDouble(),n2= readln()!!.toDouble())}

    }}






