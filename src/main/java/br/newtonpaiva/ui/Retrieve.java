package br.newtonpaiva.ui;

public class Retrieve {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

        em.remove();

        factory.close();
        em.close();
    }
}

}
