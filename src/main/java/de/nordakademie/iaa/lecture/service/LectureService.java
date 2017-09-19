package de.nordakademie.iaa.lecture.service;

import java.util.List;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.lecture.model.Lecture;
import de.nordakademie.iaa.lecture.model.LectureRepository;

public class LectureService {

  private final LectureRepository lectureRepository = Context.LECTURE_REPOSITORY;

  public List<Lecture> findAll() {
    return lectureRepository.findAll();
  }

  public void create(final Lecture lecture) {
    lectureRepository.create(lecture);
  }
}
