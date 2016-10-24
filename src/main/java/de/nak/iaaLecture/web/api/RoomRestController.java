package de.nak.iaaLecture.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.nak.iaaLecture.domain.Room;
import de.nak.iaaLecture.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomRestController {

  @Autowired
  private RoomService roomService;

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<List<Room>> getAllRooms() {
    return new ResponseEntity<>(roomService.listAll(), HttpStatus.OK);
  }

  @GetMapping(path = "/{roomNaturalId}")
  public ResponseEntity<Room> getRoom(@PathVariable final String roomNaturalId) {
    return new ResponseEntity<>(roomService.find(roomNaturalId), HttpStatus.OK);
  }
}
