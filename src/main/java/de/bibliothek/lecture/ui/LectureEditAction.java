package de.bibliothek.lecture.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.bibliothek.lecture.model.Lecture;
import de.bibliothek.lecture.service.LectureService;

public class LectureEditAction extends ActionSupport {

  private final LectureService lectureService;

  private Lecture lecture;

  @Autowired
  public LectureEditAction(final LectureService lectureService) {
    this.lectureService = lectureService;
  }

  public String getForm() {
    return SUCCESS;
  }

  public String saveLecture() {
    lectureService.create(lecture);
    return SUCCESS;
  }

  @Override
  public void validate() {
    // more complicated validations go here!
  }

  public Lecture getLecture() {
    return lecture;
  }

  public void setLecture(final Lecture lecture) {
    this.lecture = lecture;
  }
}
