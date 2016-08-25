package de.nordakademie.common;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class Room {

  private Long id;
  private String building;
  private int roomNumber;
  private int seats;
  private boolean presenterAvailable;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  @NaturalId
  public String getBuilding() {
    return building;
  }

  public void setBuilding(final String building) {
    this.building = building;
  }

  @NaturalId
  @Column(name = "room_number")
  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(final int roomNumber) {
    this.roomNumber = roomNumber;
  }

  @Basic
  public int getSeats() {
    return seats;
  }

  public void setSeats(final int seats) {
    this.seats = seats;
  }

  @Basic
  @Column(name = "presenter_available")
  public boolean isPresenterAvailable() {
    return presenterAvailable;
  }

  public void setPresenterAvailable(final boolean presenterAvailable) {
    this.presenterAvailable = presenterAvailable;
  }
}
