package de.nordakademie.struts2;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.common.Lecture;
import de.nordakademie.hibernate.LectureDAO;

public class LoadLectureAction extends ActionSupport {

  private List<Lecture> lectures;
  private int roomNumber = Integer.MAX_VALUE;

  public String loadLectures() {

    lectures = LectureDAO.findAll(roomNumber);

    return SUCCESS;
  }

  public List<Lecture> getLectures() {
    return lectures;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(final int roomNumber) {
    this.roomNumber = roomNumber;
  }
}
