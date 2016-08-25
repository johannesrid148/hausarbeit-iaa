package de.nordakademie.hibernate;

import java.util.Date;

import javax.persistence.EntityManager;

import de.nordakademie.common.Course;
import de.nordakademie.common.Lecture;
import de.nordakademie.common.Room;

public class LectureDAO {

  public static void main(final String[] args) {
    final Course course = new Course();
    course.setFieldOfStudy("IAA");
    course.setNumber(42);
    course.setLecturer("Bene");
    course.setTitle("Hibernate");

    final Room room = new Room();
    room.setBuilding("C");
    room.setRoomNumber(110);
    room.setSeats(30);
    room.setPresenterAvailable(true);

    final Lecture lecture = new Lecture();
    lecture.setBeginDate(new Date());
    lecture.setEndDate(new Date());
    lecture.setCourse(course);
    lecture.setRoom(room);

    create(lecture);

    HibernateUtil.getEntityManagerFactory().close();
  }

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
