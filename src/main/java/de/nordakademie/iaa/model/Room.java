package de.nordakademie.iaa.model;

public class Room {

  private String building;
  private String roomNumber;

  public Room(final String building, final String roomNumber) {
    this.building = building;
    this.roomNumber = roomNumber;
  }

  public String getBuilding() {
    return building;
  }

  public void setBuilding(final String building) {
    this.building = building;
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(final String roomNumber) {
    this.roomNumber = roomNumber;
  }
}
