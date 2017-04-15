package de.nordakademie.iaa;

import de.nordakademie.iaa.model.RoomRepository;
import de.nordakademie.iaa.service.RoomService;
import de.nordakademie.iaa.service.RoomServiceImpl;

public class Context {

  public static final RoomRepository ROOM_REPOSITORY = new RoomRepository();
  public static final RoomService ROOM_SERVICE = new RoomServiceImpl();
}
