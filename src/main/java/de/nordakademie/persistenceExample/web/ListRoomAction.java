package de.nordakademie.persistenceExample.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;

import de.nordakademie.persistenceExample.domain.model.Room;
import de.nordakademie.persistenceExample.service.RoomService;

@Getter
public class ListRoomAction extends ActionSupport {

  private List<Room> rooms;
  private final RoomService roomService;

  @Autowired
  public ListRoomAction(final RoomService roomService) {
    this.roomService = roomService;
  }

  public String listAll() {
    rooms = roomService.listAll();
    return SUCCESS;
  }
}
