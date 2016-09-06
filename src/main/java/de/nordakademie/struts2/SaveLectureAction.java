package de.nordakademie.struts2;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.common.Course;
import de.nordakademie.common.Lecture;
import de.nordakademie.common.Room;
import de.nordakademie.hibernate.LectureDAO;

public class SaveLectureAction extends ActionSupport {

  public String saveLecture() {

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

    LectureDAO.create(lecture);

    return SUCCESS;
  }
}
