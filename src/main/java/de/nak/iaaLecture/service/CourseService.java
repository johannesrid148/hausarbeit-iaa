package de.nak.iaaLecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.nak.iaaLecture.domain.Course;
import de.nak.iaaLecture.domain.CourseRepository;

@Service
public class CourseService {

  private final CourseRepository courseRepository;

  @Autowired
  public CourseService(final CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  @Transactional
  public void saveCourse(final Course course) {
    courseRepository.createCourse(course);
  }

  @Transactional(readOnly = true)
  public List<Course> listAll() {
    return courseRepository.findAll();
  }
}
