package de.nordakademie.iaaLecture.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

import de.nordakademie.iaaLecture.domain.Room;
import de.nordakademie.iaaLecture.service.RoomService;

public class EditRoomAction extends ActionSupport {

  @Getter
  @Setter
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
