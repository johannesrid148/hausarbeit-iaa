package de.nordakademie.iaa.lecture.ui;

import java.util.List;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.lecture.model.Lecture;
import de.nordakademie.iaa.lecture.service.LectureService;

public class LectureListAction implements Action {

  private final LectureService lectureService = Context.LECTURE_SERVICE;
  private List<Lecture> lectures;

  @Override
  public String execute() {
    lectures = lectureService.findAll();
    return SUCCESS;
  }

  public List<Lecture> getLectures() {
    return lectures;
  }
}
