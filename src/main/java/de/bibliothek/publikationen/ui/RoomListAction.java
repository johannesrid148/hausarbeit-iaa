package de.bibliothek.publikationen.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import de.bibliothek.publikationen.service.RoomService;
import de.bibliothek.publikationen.model.Room;
import com.opensymphony.xwork2.Action;



public class RoomListAction implements Action {

  private final de.bibliothek.publikationen.service.RoomService roomService;

  private List<de.bibliothek.publikationen.model.Room> rooms;

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
