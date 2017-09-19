package de.nordakademie.iaa.lecture.ui;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.lecture.model.Lecture;
import de.nordakademie.iaa.lecture.service.LectureService;

public class LectureEditAction extends ActionSupport {

  private final LectureService lectureService = Context.LECTURE_SERVICE;
  private Lecture lecture;

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
