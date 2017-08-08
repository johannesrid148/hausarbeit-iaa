package de.nordakademie.iaa.ui;

import java.util.List;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.service.RoomService;

public class ListRoomsAction implements Action {

  private final RoomService roomService = Context.ROOM_SERVICE;
  private List<Room> rooms;

  @Override
  public String execute() throws Exception {
    rooms = roomService.findAll();
    return SUCCESS;
  }

  public List<Room> getRooms() {
    return rooms;
  }
}
