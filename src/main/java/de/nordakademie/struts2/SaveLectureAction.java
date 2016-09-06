package de.nordakademie.struts2;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.common.Course;
import de.nordakademie.common.Lecture;
import de.nordakademie.common.Room;
import de.nordakademie.hibernate.LectureDAO;

public class SaveLectureAction extends ActionSupport {

  private Course course;
  private Room room;

  public String saveLecture() {

    final Course course = new Course();
    course.setFieldOfStudy("IAA2");
    course.setNumber(this.course.getNumber());
    course.setLecturer("Bene");
    course.setTitle("Hibernate");

    final Room room = new Room();
    room.setBuilding("C");
    room.setRoomNumber(this.room.getRoomNumber());
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

  public Room getRoom() {
    return room;
  }

  public void setRoom(final Room room) {
    this.room = room;
  }

  public void setCourse(final Course course) {
    this.course = course;
  }
}
