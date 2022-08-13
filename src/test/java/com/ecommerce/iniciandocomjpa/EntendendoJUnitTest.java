package com.ecommerce.iniciandocomjpa;
import org.junit.*;

public class EntendendoJUnitTest {

    @Test
    public void testandoAlgo(){
        String nome = String.format("%s", "Leandro");
        Assert.assertEquals("Leandro", nome);
    }


    @Test
    public void testandoOutraCoisa(){
        System.out.println(">>>>testandoOutraCoisa()<<<<<");
    }

    @Before
    public void iniciarTeste(){
        System.out.println(">>>>iniciarTeste()<<<<<");
    }


    @AfterClass
    public static void encerrarTestes(){
        System.out.println(">>>>encerrarTestes()<<<<<");
    }
}
