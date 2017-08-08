package de.nordakademie.iaa.model;

import static java.util.Collections.synchronizedList;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RoomRepository {

  private final List<Room> rooms = synchronizedList(new ArrayList<Room>() {{
      add(new Room("B", "005"));
      add(new Room("C", "006"));
    }});

  public Room create(final Room room) {
    rooms.add(room);
    return room;
  }

  public Room read(final int index) {
    return rooms.get(index);
  }

  public List<Room> readAll() {
    LOG.info("Read all rooms");
    return rooms;
  }

  public void delete(final int index) {
    rooms.remove(index);
  }
}
