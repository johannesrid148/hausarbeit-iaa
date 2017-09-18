package de.nordakademie.iaa.room.ui;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.room.model.Room;
import de.nordakademie.iaa.room.service.RoomService;

public class EditRoomAction extends ActionSupport {

  private final RoomService roomService = Context.ROOM_SERVICE;
  private Room room;

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
