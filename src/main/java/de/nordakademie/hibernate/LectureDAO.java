package de.nordakademie.hibernate;

import javax.persistence.EntityManager;

import de.nordakademie.common.Lecture;

public class LectureDAO {

  public static void create(final Lecture lecture) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    entityManager.getTransaction().begin();

    entityManager.persist(lecture.getRoom());
    entityManager.persist(lecture.getCourse());
    entityManager.persist(lecture);

    entityManager.getTransaction().commit();
    entityManager.close();
  }
}
