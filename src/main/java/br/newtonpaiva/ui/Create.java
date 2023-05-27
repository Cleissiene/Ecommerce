package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Create {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();

        //obriga que faz tudo em uma transação

        em.getTransaction().begin();  //a transação faz que todos os comandos são guardados numa área de stage

        em.getTransaction().commit(); //depois de grava ele comita

        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

        em.persist(c);


        em.close();
        factory.close();

    }

}
