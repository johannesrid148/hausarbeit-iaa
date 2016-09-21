package de.nak.iaaLecture.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;

import de.nak.iaaLecture.domain.Course;
import de.nak.iaaLecture.service.CourseService;

public class ListCourseAction extends ActionSupport {

  @Getter
  private List<Course> courses;
  private final CourseService courseService;

  @Autowired
  public ListCourseAction(final CourseService courseService) {
    this.courseService = courseService;
  }

  public String listAll() {
    courses = courseService.listAll();
    return SUCCESS;
  }
}
