package de.nordakademie.iaa;

import de.nordakademie.iaa.model.RoomDAO;
import de.nordakademie.iaa.service.RoomService;
import de.nordakademie.iaa.service.RoomServiceImpl;

public class Context {

  public static final RoomDAO roomDAO = new RoomDAO();
  public static final RoomService roomService = new RoomServiceImpl();
}
