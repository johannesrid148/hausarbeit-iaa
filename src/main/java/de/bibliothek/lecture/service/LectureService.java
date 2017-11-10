package de.bibliothek.lecture.service;

import java.util.List;

import de.bibliothek.lecture.model.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.bibliothek.lecture.model.Lecture;
import de.bibliothek.publikationen.model.Room;
import de.bibliothek.publikationen.model.RoomRepository;

@Service
public class LectureService {

  private final LectureRepository lectureRepository;
  private final RoomRepository roomRepository;

  @Autowired
  public LectureService(final LectureRepository lectureRepository, final RoomRepository roomRepository) {
    this.lectureRepository = lectureRepository;
    this.roomRepository = roomRepository;
  }

  @Transactional(readOnly = true)
  public List<Lecture> findAll() {
    return lectureRepository.findAll();
  }

  @Transactional
  public void create(final Lecture lecture) {
    final Room room = roomRepository.findOne(lecture.getRoom().getId());
    lecture.setRoom(room);
    lectureRepository.create(lecture);
  }
}
