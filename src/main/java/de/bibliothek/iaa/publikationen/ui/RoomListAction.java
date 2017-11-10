package de.nordakademie.iaa.room.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.room.model.Room;
import de.nordakademie.iaa.room.service.RoomService;

public class RoomListAction implements Action {

  private final RoomService roomService;

  private List<Room> rooms;

  @Autowired
  public RoomListAction(final RoomService roomService) {
    this.roomService = roomService;
  }

  @Override
  public String execute() {
    rooms = roomService.findAll();
    return SUCCESS;
  }

  public List<Room> getRooms() {
    return rooms;
  }
}
