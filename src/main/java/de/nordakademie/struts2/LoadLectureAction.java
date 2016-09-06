package de.nordakademie.struts2;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.common.Lecture;
import de.nordakademie.hibernate.LectureDAO;

public class LoadLectureAction extends ActionSupport {

  private List<Lecture> lectures;

  public String loadLectures() {

    lectures = LectureDAO.findAll();

    return SUCCESS;
  }

  public List<Lecture> getLectures() {
    return lectures;
  }
}
