package com.ecommerce.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IniciarUnidadeDePersistencia {

    public static void main (String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();


        entityManager.close();
        entityManagerFactory.close();
    }
}
