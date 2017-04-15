package de.nordakademie.iaa.service;

import java.util.List;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.model.RoomRepository;

public class RoomServiceImpl implements RoomService {

  private final RoomRepository roomRepository = Context.ROOM_REPOSITORY;

  @Override
  public List<Room> findAll() {
    return roomRepository.readAll();
  }

  @Override
  public Room saveRoom(final Room room) {
    return roomRepository.create(room);
  }
}
