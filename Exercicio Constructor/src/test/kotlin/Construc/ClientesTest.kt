package Construc

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClientesTest {
    val clientes=Clientes("Jenifer","Rua","111111111")


    @Test
    fun itemTotal() {
        assertEquals(1,clientes.additem("pão"))

    }
    @Test
    fun additem() {
    clientes.additem("queijo")
        assertEquals(2,clientes.itemTotal())

    }

    @Test
    fun removeitem() {
        clientes.removeitem("queijo")
        assertEquals(1,clientes.itemTotal())
    }

}