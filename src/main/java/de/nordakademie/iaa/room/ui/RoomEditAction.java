package de.nordakademie.iaa.room.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.room.model.Room;
import de.nordakademie.iaa.room.service.RoomService;

public class RoomEditAction extends ActionSupport {

  private final RoomService roomService;

  private Room room;

  @Autowired
  public RoomEditAction(final RoomService roomService) {
    this.roomService = roomService;
  }

  public String getForm() {
    return SUCCESS;
  }

  public String saveRoom() {
    roomService.create(room);
    return SUCCESS;
  }

  @Override
  public void validate() {
    // more complicated validations go here!
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(final Room room) {
    this.room = room;
  }
}
