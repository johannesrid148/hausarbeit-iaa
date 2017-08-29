package de.nordakademie.iaa.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import de.nordakademie.iaa.model.Room;

public class PersistenceApplication {

  public static void main(final String... args) {
    // get EntityManagerFactory from our global static singleton context
    final EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();

    // create a room
    create(entityManagerFactory);

    // find a room and log it to console
    find(entityManagerFactory);

    // update the room with new values
    update(entityManagerFactory);

    // find a room and log it to console
    find(entityManagerFactory);

    // delete a room
    delete(entityManagerFactory);

    // find a room and log it to console
    find(entityManagerFactory);

    // close factory because our whole program is finished
    HibernateUtil.getEntityManagerFactory().close();
  }

  private static void update(final EntityManagerFactory entityManagerFactory) {
    // create an EntityManager for this operation only. Recreate for every transaction
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // open transaction
    entityManager.getTransaction().begin();
    // define what happens within transaction
    final Room room = entityManager.find(Room.class, 100L);
    room.setBuilding("C");
    room.setNumber("202");
    // execute transaction
    entityManager.getTransaction().commit();

    // close entityManager because our transaction is finished
    entityManager.close();
  }

  private static void delete(final EntityManagerFactory entityManagerFactory) {
    // create an EntityManager for this operation only. Recreate for every transaction
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // open transaction
    entityManager.getTransaction().begin();
    // define what happens within transaction
    final Room room = entityManager.find(Room.class, 100L);
    entityManager.remove(room);
    // execute transaction
    entityManager.getTransaction().commit();

    // close entityManager because our transaction is finished
    entityManager.close();
  }

  private static void find(final EntityManagerFactory entityManagerFactory) {
    // create an EntityManager for this operation only. Recreate for every transaction
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // open transaction
    entityManager.getTransaction().begin();
    // define what happens within transaction
    final Room room = entityManager.find(Room.class, 100L);
    System.out.println(room);
    // execute transaction
    entityManager.getTransaction().commit();

    // close entityManager because our transaction is finished
    entityManager.close();
  }

  private static void create(final EntityManagerFactory entityManagerFactory) {
    // create an EntityManager for this operation only. Recreate for every transaction
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // open transaction
    entityManager.getTransaction().begin();
    // define what happens within transaction
    // we want to save a room
    entityManager.persist(new Room(100, "A", "001"));
    // execute transaction
    entityManager.getTransaction().commit();

    // close entityManager because our transaction is finished
    entityManager.close();
  }
}
