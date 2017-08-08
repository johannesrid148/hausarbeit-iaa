package de.nordakademie.iaa.model;

public class Room {

  private String building;
  private String number;

  public Room() {
  }

  public Room(final String building, final String number) {
    this.building = building;
    this.number = number;
  }

  public String getBuilding() {
    return building;
  }

  public void setBuilding(final String building) {
    this.building = building;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(final String number) {
    this.number = number;
  }
}
