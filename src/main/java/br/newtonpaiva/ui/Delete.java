package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;

import javax.swing.text.html.parser.Entity;

public class Delete {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

        Categoria cat = em.find(Categoria.class, 1);

        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().comit();




        em.remove();

        factory.close();
        em.close();
    }
}
