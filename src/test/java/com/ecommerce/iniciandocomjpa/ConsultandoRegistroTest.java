package com.ecommerce.iniciandocomjpa;

import com.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ConsultandoRegistroTest extends EntityManagerTest {

    @Test
    public void buscarPorIdentificador(){
        Produto produto = entityManager.find(Produto.class,1);
        //Produto produto = entityManager.getReference(Produto.class,1);

        Assert.assertNotNull(produto);
       // System.out.println(">>>>>>" + produto.getNome());
        Assert.assertEquals("Kindle", produto.getNome());
    }
    @Test
    public void atualizarAReferencia(){
        Produto produto = entityManager.find(Produto.class,1);
        produto.setNome("Microfone Samson");
        entityManager.refresh(produto);
        Assert.assertEquals("Kindle",produto.getNome());
    }
}