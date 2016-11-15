package de.nordakademie.iaa.model;

import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

  private final List<Room> rooms = new ArrayList<Room>() {{
    add(new Room("B", "005"));
    add(new Room("B", "006"));
  }};;

  public boolean create(final Room room) {
    rooms.add(room);
    return true;
  }

  public Room read(final int index) {
    return rooms.get(index);
  }

  public List<Room> readAll() {
    return rooms;
  }

  public void delete(final int index) {
    rooms.remove(index);
  }
}
