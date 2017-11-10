package de.bibliothek.publikationen.model;

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
    return entityManager.createQuery("SELECT r FROM Room r", Room.class).getResultList();
  }

  public Room findOne(final long roomId) {
    return entityManager.find(Room.class, roomId);
  }
}
