package de.nordakademie.iaa.room.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public void create(final Room room) {
    entityManager.persist(room);
  }

  public List<Room> findAll() {
    final List<Room> rooms = entityManager.createQuery("SELECT r FROM Room r", Room.class).getResultList();

    if (rooms != null) {
      return rooms;
    }
    return new ArrayList<>();
  }
}
