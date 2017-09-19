package de.nordakademie.iaa.room.ui;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.nordakademie.iaa.room.model.Room;
import de.nordakademie.iaa.room.service.RoomService;

@Path("/rooms")
@Controller
public class RoomController {

  private final RoomService roomService;

  @Autowired
  public RoomController(final RoomService roomService) {
    this.roomService = roomService;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Room> findAll() {
    return roomService.findAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Room saveRoom(final Room room) {
    return roomService.create(room);
  }
}
