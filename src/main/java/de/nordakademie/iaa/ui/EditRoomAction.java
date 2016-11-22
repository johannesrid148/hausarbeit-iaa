package de.nordakademie.iaa.ui;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.service.RoomService;

public class EditRoomAction extends ActionSupport {

  private final RoomService roomService = Context.roomService;
  private Room room;

  public String getForm() throws Exception {
    return SUCCESS;
  }

  public String saveRoom() throws Exception {
    roomService.saveRoom(room);
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
