package de.nordakademie.iaa.ui;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.nordakademie.iaa.Context;
import de.nordakademie.iaa.model.Room;
import de.nordakademie.iaa.service.RoomService;

@Path("/rooms")
public class RoomController {

  private final RoomService roomService = Context.roomService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Room> findAll() {
    return roomService.findAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void saveRoom(final Room room) {
    roomService.saveRoom(room);
  }
}
