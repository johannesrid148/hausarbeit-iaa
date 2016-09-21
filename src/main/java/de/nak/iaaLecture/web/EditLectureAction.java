package de.nak.iaaLecture.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

import de.nak.iaaLecture.domain.Lecture;
import de.nak.iaaLecture.service.LectureService;

public class EditLectureAction extends ActionSupport {

  @Getter
  @Setter
  private Lecture lecture;

  @Getter
  @Setter
  private String courseNaturalId;

  @Getter
  @Setter
  private String roomNaturalId;

  private final LectureService lectureService;

  @Autowired
  public EditLectureAction(final LectureService lectureService) {
    this.lectureService = lectureService;
  }

  public String saveLecture() {
    lectureService.saveLecture(lecture, roomNaturalId, courseNaturalId);
    return SUCCESS;
  }
}
