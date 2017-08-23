package de.nordakademie.iaa.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import de.nordakademie.iaa.model.Room;

public class PersistenceApplication {

  public static void main(final String... args) {
    // get EntityManagerFactory from our global static singleton context
    final EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();

    // create an EntityManager for this operation only. Recreate for every transaction
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // open transaction
    entityManager.getTransaction().begin();
    // define what happens withing transaction
    // we want to save a room
    entityManager.persist(new Room(100, "A", "001"));
    // execute transaction
    entityManager.getTransaction().commit();

    // close entityManager because our transaction is finished
    entityManager.close();

    // close factory because our whole program is finished
    HibernateUtil.getEntityManagerFactory().close();
  }
}
