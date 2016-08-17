package de.nordakademie.hibernate;

import javax.persistence.EntityManager;

import de.nordakademie.common.Person;

public class PersonDAO {

  public static void main(final String[] args) {
    final Person personToSave = new Person();
    personToSave.setName("Frank Zimmermann");

    final Long savedPersonId = save(personToSave);

    final Person readPerson = read(savedPersonId);

    System.out.println(readPerson.getName());

    HibernateUtil.getEntityManagerFactory().close();
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
