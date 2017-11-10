package de.bibliothek.publikationen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.bibliothek.publikationen.model.Room;
import de.bibliothek.publikationen.model.RoomRepository;

@Service
public class RoomService {

  private final RoomRepository roomRepository;

  @Autowired
  public RoomService(final RoomRepository roomRepository) {
    this.roomRepository = roomRepository;
  }

  @Transactional(readOnly = true)
  public List<Room> findAll() {
    return roomRepository.findAll();
  }

  @Transactional
  public void create(final Room room) {
    roomRepository.create(room);
  }
}
