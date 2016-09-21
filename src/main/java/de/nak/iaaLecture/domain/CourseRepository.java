package de.nak.iaaLecture.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public void createCourse(final Course course) {
    entityManager.persist(course);
  }

  public List<Course> findAll() {
    return entityManager.createQuery("SELECT course FROM Course course", Course.class).getResultList();
  }

  public Course find(final String courseNaturalId) {
    final Session session = entityManager.unwrap(Session.class);
    return session.bySimpleNaturalId(Course.class).load(courseNaturalId);
  }
}
