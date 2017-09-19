package de.nordakademie.iaa.lecture.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.room.model.Room;

public class LectureRepository {

  public void create(final Lecture lecture) {
    final EntityManager entityManager = Context.createEntityManager();

    entityManager.getTransaction().begin();

    final Room room = entityManager.find(Room.class, lecture.getRoom().getId());
    lecture.setRoom(room);
    entityManager.persist(lecture);

    entityManager.getTransaction().commit();

    entityManager.close();
  }

  public List<Lecture> findAll() {
    final EntityManager entityManager = Context.createEntityManager();

    entityManager.getTransaction().begin();
    final List<Lecture> lectures = entityManager.createQuery("SELECT l FROM Lecture l", Lecture.class).getResultList();
    entityManager.getTransaction().commit();

    entityManager.close();
    if (lectures != null) {
      return lectures;
    }
    return new ArrayList<>();
  }
}
