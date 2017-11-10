package de.bibliothek.lecture.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.bibliothek.lecture.model.Lecture;
import de.bibliothek.lecture.service.LectureService;

public class LectureListAction implements Action {

  private final LectureService lectureService;

  private List<Lecture> lectures;

  @Autowired
  public LectureListAction(final LectureService lectureService) {
    this.lectureService = lectureService;
  }

  @Override
  public String execute() {
    lectures = lectureService.findAll();
    return SUCCESS;
  }

  public List<Lecture> getLectures() {
    return lectures;
  }
}
