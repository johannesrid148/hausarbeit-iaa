package de.nordakademie.iaa.service;

import java.util.List;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.model.RoomRepository;

public class RoomService {

  private final RoomRepository roomRepository = Context.ROOM_REPOSITORY;

  public List<Room> findAll() {
    return roomRepository.findAll();
  }

  public void create(final Room room) {
    roomRepository.create(room);
  }
}
