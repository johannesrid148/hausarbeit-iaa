package de.nak.iaaLecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.nak.iaaLecture.domain.RoomRepository;
import de.nak.iaaLecture.domain.Room;

@Service
public class RoomService {

  private final RoomRepository roomRepository;

  @Autowired
  public RoomService(final RoomRepository roomRepository) {
    this.roomRepository = roomRepository;
  }

  @Transactional
  public void saveRoom(final Room room) {
    roomRepository.createRoom(room);
  }

  @Transactional(readOnly = true)
  public List<Room> listAll() {
    return roomRepository.findAll();
  }

  public Room find(final String roomNaturalId) {
    return roomRepository.find(roomNaturalId);
  }
}
