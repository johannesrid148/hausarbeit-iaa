package de.nordakademie.persistenceExample.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

import de.nordakademie.persistenceExample.domain.model.Room;
import de.nordakademie.persistenceExample.service.RoomService;

@Getter
@Setter
public class EditRoomAction extends ActionSupport {

  private Room room;
  private final RoomService roomService;

  @Autowired
  public EditRoomAction(final RoomService roomService) {
    this.roomService = roomService;
  }

  public String saveRoom() {
    roomService.saveRoom(room);
    return SUCCESS;
  }
}
