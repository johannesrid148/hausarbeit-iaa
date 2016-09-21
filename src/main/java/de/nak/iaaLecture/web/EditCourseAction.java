package de.nak.iaaLecture.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

import de.nak.iaaLecture.domain.Course;
import de.nak.iaaLecture.service.CourseService;

public class EditCourseAction extends ActionSupport {

  @Getter
  @Setter
  private Course course;
  private final CourseService courseService;

  @Autowired
  public EditCourseAction(final CourseService courseService) {
    this.courseService = courseService;
  }

  public String saveCourse() {
    courseService.saveCourse(course);
    return SUCCESS;
  }
}
