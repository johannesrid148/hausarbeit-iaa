package de.nak.iaaLecture.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class LectureRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public void createLecture(final Lecture lecture) {
    entityManager.persist(lecture);
  }

  public List<Lecture> findAll() {
    return entityManager.createQuery("SELECT lecture FROM Lecture lecture", Lecture.class).getResultList();
  }
}
