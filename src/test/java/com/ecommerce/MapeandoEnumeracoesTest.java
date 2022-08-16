package com.ecommerce;

import com.ecommerce.model.Cliente;
import com.ecommerce.model.SexoCliente;
import org.junit.Assert;
import org.junit.Test;

public class MapeandoEnumeracoesTest extends EntityManagerTest {

    @Test
    public void testarEnun(){

        Cliente cliente = new Cliente();
        cliente.setId(5L);
        cliente.setNome("Joana Joanas");
        cliente.setSexo(SexoCliente.FEMININO);

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.clear();

        Cliente clieteVerifica = entityManager.find(Cliente.class,cliente.getId());
        Assert.assertNotNull(clieteVerifica);



    }

}
