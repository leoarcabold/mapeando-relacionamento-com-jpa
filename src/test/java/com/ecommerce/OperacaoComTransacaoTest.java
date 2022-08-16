package com.ecommerce;

import com.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OperacaoComTransacaoTest extends EntityManagerTest {
    @Test
    public void inserindoOPrimeiroObjeto(){
        Produto produto = new Produto();
        produto.setId(2L);
        produto.setDescricao("A melhor imagem já vista");
        produto.setNome("Camera Canon");
        produto.setPreco(new BigDecimal(5000));

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        //entityManager.getTransaction().commit();
        entityManager.flush();

        Produto verificador = entityManager.find(Produto.class,produto.getId());
                System.out.println(">>>>" + verificador.getId());
                Assert.assertNotNull(verificador);


    }
    @Test
    public void abrirEFechaATransacao() {

        Produto produto = new Produto();


        entityManager.getTransaction();
        entityManager.persist(produto);
        entityManager.merge(produto);
        entityManager.remove(produto);
        entityManager.getTransaction().commit();
    }
}
