package de.nordakademie.hibernate;

import java.util.List;

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

  public static List<Lecture> findAll(final int roomNumber) {
    final EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    entityManager.getTransaction().begin();

    final List<Lecture> lectures = entityManager.createQuery("from Lecture where room.roomNumber < :roomNumber")
      .setParameter("roomNumber", roomNumber)
      .getResultList();

    entityManager.getTransaction().commit();
    entityManager.close();

    return lectures;
  }
}
