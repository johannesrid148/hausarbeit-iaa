package de.nordakademie.iaa.service;

import java.util.List;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.model.RoomDAO;

public class RoomServiceImpl implements RoomService {

  private final RoomDAO roomDAO = Context.roomDAO;

  @Override
  public List<Room> findAll() {
    return roomDAO.readAll();
  }

  @Override
  public boolean saveRoom(final Room room) {
    return roomDAO.create(room);
  }
}
