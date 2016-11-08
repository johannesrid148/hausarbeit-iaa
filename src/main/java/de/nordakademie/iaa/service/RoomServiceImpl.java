package de.nordakademie.iaa.service;

import java.util.List;

import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.model.RoomDAO;

public class RoomServiceImpl implements RoomService {

  private final RoomDAO roomDAO = new RoomDAO();

  @Override
  public List<Room> findAll() {
    return roomDAO.readAll();
  }
}
