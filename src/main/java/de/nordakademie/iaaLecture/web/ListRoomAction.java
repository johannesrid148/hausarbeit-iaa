package de.nordakademie.iaaLecture.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;

import de.nordakademie.iaaLecture.domain.Room;
import de.nordakademie.iaaLecture.service.RoomService;

public class ListRoomAction extends ActionSupport {

  @Getter
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
