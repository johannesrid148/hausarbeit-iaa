package de.nordakademie.hibernate;

import javax.persistence.EntityManager;

import de.nordakademie.common.Person;

public class PersonDAO {

  public static void main(final String[] args) {
    try {
      final Person personToSave = new Person();
      personToSave.setName("Frank Zimmermann");

      final Long savedPersonId = save(personToSave);

      final Person readPerson = read(savedPersonId);
      System.out.println(readPerson.getName());

      readPerson.setName("Bene");
      update(readPerson);
      final Person readPerson3 = read(savedPersonId);
      System.out.println(readPerson3.getName());

      delete(savedPersonId);

      final Person readPerson2 = read(savedPersonId);
      System.out.println(readPerson2.getName());
    } catch (final NullPointerException nullPointerException) {
      nullPointerException.printStackTrace();
    } finally {
      HibernateUtil.getEntityManagerFactory().close();
    }
  }

  public static void update(final Person newPerson) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    final Person person = entityManager.find(Person.class, newPerson.getId());
    person.setName(newPerson.getName());

    entityManager.getTransaction().commit();
    entityManager.close();
  }

  public static void delete(final Long id) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    entityManager.getTransaction().begin();

    final Person person = entityManager.find(Person.class, id);
    entityManager.remove(person);

    entityManager.getTransaction().commit();
    entityManager.close();
  }

  public static Person read(final Long personId) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    entityManager.getTransaction().begin();
    final Person person = entityManager.find(Person.class, personId);
    entityManager.getTransaction().commit();

    entityManager.close();

    return person;
  }

  public static Long save(final Person person) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    entityManager.getTransaction().begin();
    entityManager.persist(person);
    entityManager.getTransaction().commit();

    entityManager.close();

    return person.getId();
  }
}
