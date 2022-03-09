import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{


    @Test

    fun subTest(){

        assertEquals(3.0, Calculadora.sub(4.0, 1.0))

    }
@Test

fun addTest(){
    assertEquals(5.0, Calculadora.add(4.0, 1.0))

}
@Test
fun divTest(){
    assertEquals(2.0, Calculadora.div(4.0, 2.0))}

    @Test

    fun multiTest(){
        assertEquals(4.0, Calculadora.multi(4.0, 1.0))
    }

}
