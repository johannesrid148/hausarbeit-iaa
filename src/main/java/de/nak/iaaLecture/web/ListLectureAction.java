package de.nak.iaaLecture.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;

import de.nak.iaaLecture.domain.Lecture;
import de.nak.iaaLecture.service.LectureService;

public class ListLectureAction extends ActionSupport {

  @Getter
  private List<Lecture> lectures;
  private final LectureService lectureService;

  @Autowired
  public ListLectureAction(final LectureService lectureService) {
    this.lectureService = lectureService;
  }

  public String listAll() {
    lectures = lectureService.listAll();
    return SUCCESS;
  }
}
