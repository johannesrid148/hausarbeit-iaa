package de.nordakademie.iaa.model;

import java.util.Arrays;
import java.util.List;

public class RoomDAO {

  private final List<Room> rooms = Arrays.asList(
    new Room("B", "005"), new Room("B", "006"));

  public void create(final Room room) {
    rooms.add(room);
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
